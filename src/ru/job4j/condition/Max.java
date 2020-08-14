package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean boo = left > right;
         int result = boo ? left : right;
         return result;
    }
}