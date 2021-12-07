package ru.job4j.loop;

public class PrintNTom {
    public static int out(int n, int m) {
        for (n=n; n < m; n++){
            System.out.println(n);
        }

        return n;
    }

    public static void main(String[] args) {
        int a = PrintNTom.out(2,4);
        System.out.println(a);
    }
}
