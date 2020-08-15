package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            for (int i = n; i >= 1; i--) {
                result *= i;
            }
            return result;
        }
    }

}
