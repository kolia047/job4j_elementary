package ru.job4j.loop;


    class PrintNTo0 {
        public static int out(int n) {
            int i = 0;
            for (n = n-1; i <= n; n--) {
                System.out.println(n);
            }
            return i;
        }

        public static void main(String[] args) {
            int a = PrintNTo0.out(3);
        }
    }

