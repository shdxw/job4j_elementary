package ru.job4j.calculator;

public class Fit {
    /**
     * Метод  для подсчета идеального веса мужчин
     */
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    /**
     * Метод  для подсчета идеального веса женщин
     */
    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}
