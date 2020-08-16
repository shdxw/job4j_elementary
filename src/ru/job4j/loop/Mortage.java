package ru.job4j.loop;

public class Mortage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        while (amount > 0) {
            amount += percent * amount;
            amount -= salary;
            year += 1;
        }
        return year;
    }
}
