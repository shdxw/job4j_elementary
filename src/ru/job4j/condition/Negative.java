package ru.job4j.condition;

public class Negative {
    public static void possibleDiv(int number) {
        boolean result = number < 0;
        if (result) {
            System.out.println("This is negative number");
        }
    }
}