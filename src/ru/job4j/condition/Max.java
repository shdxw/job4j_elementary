package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        boolean boo = left > right;
         int result = boo ? left : right;
         return result;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public int max(int first, int second, int third, int fourth) {
       return max(max(first, second, third), fourth);
    }
}