

package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int exp = 120;
        int in = 5;
        int out = Factorial.calc(in);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int exp = 1;
        int in = 0;
        int out = Factorial.calc(in);
    }
}

