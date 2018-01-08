package ru.job4j.array;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * Test.
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {

    /**
     * Test indexOf(), IndexFound.
     */

    @Test
    public void whenIndexFound() {
        FindLoop findLoop = new FindLoop();
        int[] arr = {1, 4, 8, 11, 25};
        int rst = findLoop.indexOf(arr, 25);
        assertThat(rst, is(4));
    }

    /**
     * Test indexOf(), IndexNotFound.
     */

    @Test
    public void whenIndexNotFound() {
        FindLoop findLoop = new FindLoop();
        int[] arr = {1, 4, 8, 11, 25};
        int rst = findLoop.indexOf(arr, 6);
        assertThat(rst, is(-1));
    }

}
