package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenArrayHas8ThenMinus1() {
        int[] data = {6, 1, 8, 2};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}