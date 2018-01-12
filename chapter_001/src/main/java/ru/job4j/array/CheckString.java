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
        if (!(originChar.length < subChar.length)) {

            for  (int i = 0; i < originChar.length; i++) {
                if (subChar [0] == originChar[i]) {
                    cont = true;
                    int j = 1;
                    while ((j < subChar.length) && (cont)) {
                        if ((i + j) == originChar.length) {
                            cont = false;
                        }
                        else if (!(subChar [j] == originChar[i + j])) {
                            cont = false;
                        }
                        j++;
                    }
                }
                if (cont) {
                    return cont;
                }

            }
        }
        return cont;

    }
}
