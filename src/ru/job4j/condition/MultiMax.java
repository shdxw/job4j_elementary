package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int one = first > second ? first : second;
        return one > third ? one : third;
    }
}