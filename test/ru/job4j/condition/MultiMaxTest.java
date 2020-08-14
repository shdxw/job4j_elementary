package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 4, 2);
        assertThat(result, is(6));
    }

    @Test
    public void when2Max() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void when3Max() {
        int result = MultiMax.max(1, 4, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}