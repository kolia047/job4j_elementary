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

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind6() {
        int[] data = new int[] {5, 12, 10, 2, 4, 5, 45, 18, 23};
        int el = 45;
        int start = 2;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFindMinus1() {
        int[] data = new int[] {5, 12, 10, 2, 4, 5, 45, 18, 23};
        int el = 9;
        int start = 1;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}