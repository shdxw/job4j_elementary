package ru.job4j.condition;

import static java.lang.Math.sqrt;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void distance3dZero() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0, 0, 0);
        double exp = 0;
        assertEquals(exp, point1.distance3d(point2), 0.01);
    }

    @Test
    public void distance3done() {
        Point point1 = new Point(2, 2, 2);
        Point point2 = new Point(0, 0, 0);
        double exp = sqrt(12);
        assertEquals(exp, point1.distance3d(point2), 0.01);
    }

    @Test
    public void distance3dtwo() {
        Point point1 = new Point(1, 1, 1);
        Point point2 = new Point(0, 0, 0);
        double exp = sqrt(3);
        assertEquals(exp, point1.distance3d(point2), 0.01);
    }

    @Test
    public void distance3dthree() {
        Point point1 = new Point(10, 10, 10);
        Point point2 = new Point(5, 5, 5);
        double exp = sqrt(75);
        assertEquals(exp, point1.distance3d(point2), 0.01);
    }

}