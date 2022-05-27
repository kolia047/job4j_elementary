package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when24and45Then45() {
        int first = 24;
        int second = 45;
        int expected = 45;
        int out = Max.max(first, second);
        assertEquals(expected, out);
    }

    @Test
    public void when24and45and53Then53() {
        int first = 24;
        int second = 45;
        int third = 53;
        int expected = 53;
        int out = Max.max(first, second, third);
        assertEquals(expected, out);
    }

    @Test
    public void when25and12and2548and1256Then2548() {
        int first = 25;
        int second = 12;
        int third = 2548;
        int four = 1256;
        int expected = 2548;
        int out = Max.max(first, second, third, four);
        assertEquals(expected, out);
    }
}
