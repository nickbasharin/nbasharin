package ru.job4j2.tracker;
import java.util.Random;

/**
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position] = item;
        position++;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rand = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String digits = "0123456789";
        String allSymbols = upper + lower + digits;
        char[] allSymbolsInChar = allSymbols.toCharArray();
        boolean keyGood = true;
        String key = new String();
        do {
            key = "";
            for (int i = 0; i < 7; i++) {
                key += allSymbolsInChar[rand.nextInt(allSymbolsInChar.length)];
            }
            for (int i = 0; i < position; i++) {
                if (items[i].getId().equals(key)) {
                    keyGood = false;
                }
            }
        } while (!keyGood);
        return key;
    }
    /**
     * Метод редактирует заяку.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @param id - id заявки, item - заявка, параметры которой заменят старые параметры
     */
    public void replace(String id, Item item) {

        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(item.getId())) {
                items[i]  = item;
            }
        }

    }

    /**
     * Метод удаляет заяку.
     * @param id - id заявки
     */
    public void delete(String id) {
        int itemNumber = 0;
        boolean checkId = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                itemNumber = i;
                checkId = true;
            }
        }
        if (checkId) {
            System.arraycopy(items, itemNumber + 1, items, itemNumber, position - 1 - itemNumber);
            items[position - 1] = null;
            position--;
        }
    }

    /**
     * Метод возвращает все заяки.
     * @return массив всех заявок Item
     */
    public Item[] findAll() {
            Item[] copyItems = new Item[position];
            System.arraycopy(items, 0, copyItems, 0, position);
            return copyItems;
    }

    /**
     * Метод возвращает заявкb, содержащие ключ в имени.
     * @param key - символьный ключ
     * @return массив всех заявок Item, содержащие ключ в имени
     */
    public Item[] findByName(String key) {
        int names = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                names++;
            }
        }
        Item[] keyItems = new Item[names];
        int countKey = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                keyItems[countKey] = items[i];
                countKey++;
            }
        }

        return keyItems;
    }

    /**
     * Метод возвращает заяку по id.
     * @param id - id заявки
     * @return заявка Item, c нужным id
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                result = items[i];
                break;
            }

        }
            return result;
    }
}
