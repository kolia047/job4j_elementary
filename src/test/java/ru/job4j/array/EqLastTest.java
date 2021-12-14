package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 9};
        int[] right = {3, 3, 8};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}