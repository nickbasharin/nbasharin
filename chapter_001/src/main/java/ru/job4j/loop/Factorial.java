package ru.job4j.loop;

/**
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    public int calc(int n) {
        int fac = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                fac = fac * i;
            }
        }
        return fac;
    }
}
