package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void exist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void notExist() {
        boolean result = Triangle.exist(6.0, 2.0, 2.0);
        assertThat(result, not(true));
    }
}