package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sumByEven() {
        int rsl = Sum.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEven2() {
        int rsl = Sum.sumByEven(10, 11);
        int expected = 10;
        assertThat(rsl, is(expected));
    }

}