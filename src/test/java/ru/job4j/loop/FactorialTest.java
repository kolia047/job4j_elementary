package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
            int n = 5;
            int result = Factorial.calc(n);
            int expected = 120;
            Assert.assertEquals(result, expected);
        }

        @Test
        public void whenCalculateFactorialForZeroThenOne() {
            int n = 0;
            int result = Factorial.calc(n);
            int expected =1;
            Assert.assertEquals(result, expected);
        }
    }