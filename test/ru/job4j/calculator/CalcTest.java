package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void whenBCZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = Calc.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertEquals(expected, rsl);
    }

    @Test
    public void whenAllOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = Calc.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenAZero() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = Calc.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenCZero() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = Calc.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenXZero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = Calc.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }
}