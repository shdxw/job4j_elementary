package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = (p / (2 * (k + 1)));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }
}
