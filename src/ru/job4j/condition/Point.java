package ru.job4j.condition;
import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double y = y2 - y1;
        double x = x2 - x1;
        double rsl = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return rsl;
    }
}
