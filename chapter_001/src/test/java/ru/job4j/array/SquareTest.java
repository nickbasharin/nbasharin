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
public class SquareTest {
    /**
     * Test calculate(5).
     */

    @Test
    public void whenArrayHave5() {
        Square square = new Square();
        int[] rst = square.calculate(5);
        int[] arr = {1, 4, 9, 16, 25};
        assertThat(rst, is(arr));
    }
}
