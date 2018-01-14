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

public class CheckStringTest {
    /**
     * Test contains()
     */
    @Test
    public void whenOriginalStringContainsString() {
        String sub = "last";
        String original = "today last day";
        CheckString checkString = new CheckString();
        boolean rst = checkString.contains(original, sub);
        assertThat(rst, is(true));
    }

    /**
     * Test contains()
     */
    @Test
    public void whenOriginalStringContainsStringOfoneSymbol() {
        String sub = "1";
        String original = "5456 468 2332 1";
        CheckString checkString = new CheckString();
        boolean rst = checkString.contains(original, sub);
        assertThat(rst, is(true));
    }
    /**
     * Test contains()
     */
    @Test
    public void whenOriginalStringDoesntContainsString() {
        String sub = "dayday";
        String original = "today last day";
        CheckString checkString = new CheckString();
        boolean rst = checkString.contains(original, sub);
        assertThat(rst, is(false));
    }
    /**
     * Test contains()
     */

    @Test
    public void whenSubStringBiggerThanOriginal() {
        String sub = "today go away";
        String original = "today";
        CheckString checkString = new CheckString();
        boolean rst = checkString.contains(original, sub);
        assertThat(rst, is(false));
    }



}
