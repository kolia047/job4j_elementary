package ru.job4j.array;

public class CrossArray {
    public static int printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            // int a = left[i];
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);

                }
            }
        }
        return 0;
    }
}