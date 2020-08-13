package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 110;
        double exp = 11.5;
        double out = Fit.manWeight(in);
        assertEquals(out, exp, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 120;
        double exp = 11.5;
        double out = Fit.womanWeight(in);
        assertEquals(out, exp, 0.01);
    }
}