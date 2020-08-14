package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeftmax() {
        int a = 1;
        int b = 2;
        int exp = 2;
        int res = Max.max(a, b);
        assertEquals(exp, res);
    }

    @Test
    public void whenRightmax() {
        int a = 2;
        int b = 1;
        int exp = 2;
        int res = Max.max(a, b);
        assertEquals(exp, res);
    }

    @Test
    public void whenBothmax() {
        int a = 2;
        int b = 2;
        int exp = 2;
        int res = Max.max(a, b);
        assertEquals(exp, res);
    }
}