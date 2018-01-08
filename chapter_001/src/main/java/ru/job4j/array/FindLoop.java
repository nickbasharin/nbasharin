package ru.job4j.array;
/**
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {

    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;

                break;
            }
        }

        return rsl;
    }
}
