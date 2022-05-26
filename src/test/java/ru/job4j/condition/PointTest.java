package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to69then8dot60() {
        double expected = 8.60;
        Point a = new Point(1, 2);
        Point b = new Point(6, 9);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when58to15then5() {
        double expected = 5.0;
        Point a = new Point(5, 8);
        Point b = new Point(1, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when21to41then2() {
        double expected = 2.0;
        Point a = new Point(2, 1);
        Point b = new Point(4, 1);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}