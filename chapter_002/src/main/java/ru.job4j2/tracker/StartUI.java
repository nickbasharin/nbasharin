package ru.job4j2.tracker;

/**
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class StartUI {

    private static final String ADD = "0";

    private static final String SHOWALLITEMS = "1";

    private static final String EDITITEM = "2";

    private static final String DELETEITEM = "3";

    private static final String FINDBYID = "4";

    private static final String FINDBYNAME = "5";

    private static final String EXIT = "6";

    private final Input input;

    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALLITEMS.equals(answer)) {
                showAllItems();
            } else if (EDITITEM.equals(answer)) {
                editItem();
            } else if (DELETEITEM.equals(answer)) {
                deleteItem();
            } else if (FINDBYID.equals(answer)) {
                showItemById();
            } else if (FINDBYNAME.equals(answer)) {
                showItemsByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showAllItems() {
        Item[] allItems = this.tracker.findAll();
        for (Item item:allItems) {
            System.out.println("Заявка Id: " + item.getId() + ", имя: " + item.getName() + ", описание: " + item.getDesc());
        }
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        Item editedItem = findById();
        if (editedItem != null) {
            System.out.println("------------ Редактирование заявки с Id : " + editedItem.getId() + "-----------");
            String name = this.input.ask("Введите новое имя заявки :");
            String desc = this.input.ask("Введите новое описание заявки :");
            editedItem.setName(name);
            editedItem.setDesc(desc);
        } else {
            System.out.println("Заявка с таким Id не найдена");
        }
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        Item deletedItem = findById();
        if (deletedItem != null) {
            this.tracker.delete(deletedItem.getId());
            System.out.println("Заявка с Id : " + deletedItem.getId() + " успешно удалена");
        } else {
            System.out.println("Заявка с таким Id не найдена");
        }
    }

    private void showItemById() {
        Item showedItem = findById();
        if (showedItem != null) {
            System.out.println("Заявка Id: " + showedItem.getId() + ", имя: " + showedItem.getName() + ", описание: " + showedItem.getDesc());
        } else {
            System.out.println("Заявка с таким Id не найдена");
        }
    }

    private void showItemsByName() {
        String key = this.input.ask("Введите имя для поиска заявок :");
        Item[] keyItems = this.tracker.findByName(key);
        if (keyItems.length > 0) {
            for (Item item : keyItems) {
                System.out.println("Заявка Id: " + item.getId() + ", имя: " + item.getName() + ", описание: " + item.getDesc());
            }
        } else {
            System.out.println("Заявка c именем: " + key + " не найдена");
        }
    }


    private Item findById() {
        String id = this.input.ask("Введите id заявки :");
        return this.tracker.findById(id);
    }


    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
