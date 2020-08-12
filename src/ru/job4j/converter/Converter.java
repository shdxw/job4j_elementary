package ru.job4j.converter;

public class Converter {

        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60; /* формула перевода рублей в доллары. */
            return rsl;
        }

    }

