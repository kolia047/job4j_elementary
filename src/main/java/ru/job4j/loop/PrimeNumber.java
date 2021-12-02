package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        int i = 1;
        for (int number = 1; number <= finish; number++ ) {
            if (CheckPrimeNumber.check(number)) {
              count += i;
            }
        }
        return count;
    }
}
