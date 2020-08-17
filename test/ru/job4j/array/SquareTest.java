package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateIf3() {
        int[] exp = new int[] {0, 1, 4};
        int[] in = Square.calculate(3);
        assertArrayEquals(in, exp);
    }

    @Test
    public void calculateIfFive() {
        int[] exp = new int[] {0, 1, 4, 9, 16};
        int[] in = Square.calculate(5);
        assertArrayEquals(in, exp);
    }
}