package ru.job4j;
import ru.job4j.converter.Converter;

public class Main {

    public static void main(String[] args) {
        int inE = 210;
        int inD = 120;
        int expE = 3;
        int expD = 2;
        int outE = Converter.rubleToEuro(inE);
        int outD = Converter.rubleToDollar(inD);
        boolean passE = expE == outE;
        boolean passD = expD == outD;
        System.out.println("210 rubles are 3 euro. Result: " + passE);
        System.out.println("120 rubles are 2 dollars. Result: " + passD);
    }

    }

