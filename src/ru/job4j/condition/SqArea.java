package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = (p/(2*(k+1)));
        double rsl = Math.pow(h,2) * k;
        return rsl;

    }
}
