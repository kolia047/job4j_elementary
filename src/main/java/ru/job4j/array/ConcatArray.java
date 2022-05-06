package ru.job4j.array;

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        int d = 0;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            d++;
        }
        for (int j = 0; j < b.length; j++) {
            c++;
        }

        return d + c;
    }
}
