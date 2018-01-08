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

public class BubbleSortTest {
    /**
     * Test sort()
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] rst = bubbleSort.sort(arr);
        int[] back = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(rst, is(back));
    }
}