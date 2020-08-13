package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 10;
        int x2 = 10;
        int y1 = 10;
        int y2 = 10;
        double exp = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(out, exp, 0.01);
    }
}