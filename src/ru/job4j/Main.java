package ru.job4j;

import ru.job4j.converter.Converter;

public class Main {

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dolrs = Converter.rubleToDollar(900);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("900 rubles are " + dolrs + " dollars.");
    }
    }

