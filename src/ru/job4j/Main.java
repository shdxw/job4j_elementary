package ru.job4j;

import ru.job4j.calculator.Fit;

public class Main {

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }
    }

