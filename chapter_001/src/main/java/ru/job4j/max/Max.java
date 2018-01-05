package ru.job4j.max;

/**
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {

    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public int max3(int first, int second, int third) {
        return max(first, max(second, third));
    }
}
