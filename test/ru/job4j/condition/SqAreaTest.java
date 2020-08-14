package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void squareZero() {
        int p = 0;
        int k = 0;
        double exp = 0;
        double out = SqArea.square(p, k);
        assertEquals(out, exp, 0.01);
    }

    @Test
    public void squareTwo() {
        int p = 15;
        int k = 3;
        double exp = 3;
        double out = SqArea.square(p, k);
        assertEquals(out, exp, 0.01);
    }

    @Test
    public void squareThree() {
        int p = 40;
        int k = 2;
        double exp = 72;
        double out = SqArea.square(p, k);
        assertEquals(out, exp, 0.01);
    }
}