package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void when025and441Then6() {
        Point a = new Point(0, 2, 5);
        Point b = new Point(4, 4, 1);
        double rsl = a.distance3d(b);
        double expected = 6;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when978and031Then12083() {
        Point a = new Point(9, 7, 8);
        Point b = new Point(0, 3, 1);
        double rsl = a.distance3d(b);
        double expected = 12.083;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}