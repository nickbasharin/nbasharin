package ru.job4j.loop;

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
public class PaintTest {
    /**
     * Test pyramid(4).
     */
    @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
    /**
     * Test pyramid(6).
     */
    @Test
    public void whenPyramid6() {
        Paint paint = new Paint();
        String rst = paint.pyramid(6);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("     ^     ")
                                .add("    ^^^    ")
                                .add("   ^^^^^   ")
                                .add("  ^^^^^^^  ")
                                .add(" ^^^^^^^^^ ")
                                .add("^^^^^^^^^^^")
                                .toString()
                )
        );
    }
}

