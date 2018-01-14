package ru.job4j.array;
import java.util.Arrays;

/**
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class CheckString {
    boolean contains(String origin, String sub) {
        boolean cont = false;
        char[] originChar = origin.toCharArray();
        char[] subChar = sub.toCharArray();
        for  (int i = 0; i < originChar.length; i++) {
            if ((subChar [0] == originChar[i]) && (i + subChar.length) <= originChar.length) {
                cont = true;
                for (int j = 1; j < subChar.length; j++) {
                    if (!(subChar [j] == originChar[i + j])) {
                        cont = false;
                        break;
                    }
                }
            }
            if (cont)  {
                break;
            }
        }
        return cont;
    }
}
