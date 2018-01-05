package ru.job4j.loop;

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
public class FactorialTest {
    /**
     * Test calc(5).
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fc = new Factorial();
        int result = fc.calc(5);
        assertThat(result, is(120));
    }
    /**
     * Test calc(0).
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fc = new Factorial();
        int result = fc.calc(0);
        assertThat(result, is(1));    }
}