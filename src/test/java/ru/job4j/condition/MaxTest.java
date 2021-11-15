package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void when24To45Then45() {
        int left = 24;
        int right = 45;
        int result = Max.max(left, right);
        int expected = 45;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when18To11Then18() {
        int left = 18;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 18;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when21To21Then21() {
        int left = 21;
        int right = 21;
        int result = Max.max(left, right);
        int expected = 21;
        Assert.assertEquals(result, expected);
    }
}