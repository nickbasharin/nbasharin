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

public class MatrixTest {
    /**
     * Test multiple()
     */
    @Test
    public void whenMatrixHasSize3() {
        Matrix matrix = new Matrix();
        int[][] rst = matrix.multiple(3);
        int[][] mat = {{0, 0, 0},
                {0, 1, 2},
                {0, 2, 4}};
        assertThat(rst, is(mat));
    }

    /**
     * Test multiple()
     */
    @Test
    public void whenMatrixHasSize5() {
        Matrix matrix = new Matrix();
        int[][] rst = matrix.multiple(5);
        int[][] mat = {{0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6, 8},
                {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}
        };
        assertThat(rst, is(mat));
    }
}

