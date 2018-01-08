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
public class TurnTest {
    /**
     * Test back()
     */

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arr = {2, 6, 1, 4};
        int[] rst = turn.back(arr);
        int[] back = {4, 1, 6, 2};
        assertThat(rst, is(back));
    }
    /**
     * Test back()
     */

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arr = {1, 2, 3, 4, 5};
        int[] rst = turn.back(arr);
        int[] back = {5, 4, 3, 2, 1};
        assertThat(rst, is(back));
    }
}
