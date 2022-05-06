package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int number = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            number++;

        }
        for (int j = 0; j < right.length; j++) {
            rsl[number++] = right[j];

        }
        for (int a = 0; a < rsl.length - 1; a++) {
            if (rsl[a] > rsl[a + 1]) {
                int temp = rsl[a];
                rsl[a] = rsl[a + 1];
                rsl[a + 1] = temp;
            }
        }
        return rsl;

    }
}