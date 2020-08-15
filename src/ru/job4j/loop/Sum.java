package ru.job4j.loop;

public class Sum {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
           sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 2));
        System.out.println(sum(2, 10));
    }
}
