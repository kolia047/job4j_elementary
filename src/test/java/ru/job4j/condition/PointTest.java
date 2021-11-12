package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when23to46then3dot6() {
        /* входные данные */
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 6;
        /* ожидаемое значение */
        double expected = 3.6;
        /* вызов проверяемого метода*/
        double out = Point.distance(x1, y1, x2, y2);
        /* сравнения */
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void when12to34then2dot8() {
        /* входные данные */
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        /* ожидаемое значение */
        double expected = 2.8;
        /* вызов проверяемого метода*/
        double out = Point.distance(x1, y1, x2, y2);
        /* сравнения */
        Assert.assertEquals(expected, out, 0.1);

    }

    @Test
    public void when58to62then6() {
        /* входные данные */
        int x1 = 5;
        int y1 = 8;
        int x2 = 6;
        int y2 = 2;
        /* ожидаемое значение */
        double expected = 6;
        /* вызов проверяемого метода*/
        double out = Point.distance(x1, y1, x2, y2);
        /* сравнения */
        Assert.assertEquals(expected, out, 0.1);

    }
}