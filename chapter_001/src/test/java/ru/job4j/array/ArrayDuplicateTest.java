package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicateTest {
    /**
     * Test remove()
     */

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String in [] = {"aaa", "fff", "ccc", "aaa", "bbb"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String res[] = arrayDuplicate.remove(in);
        String out [] = {"aaa", "fff", "ccc", "bbb"};
        assertThat(res, is(out));
    }

    /**
     * Test remove()
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        String in [] = {"aaa", "fff", "ccc", "aaa", "bbb", "ccc", "bbb", "1"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String res[] = arrayDuplicate.remove(in);
        String out [] = {"aaa", "fff", "ccc", "1", "bbb"};
        assertThat(res, is(out));
    }

}
