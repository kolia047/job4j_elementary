package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for(int i=1; i <= n; i++){
           result = result * a;

        }

        return result;
    }

    public static void main(String[] args) {
        int a = DegreeLoop.calculate(3,2);
        System.out.println(a);
    }
}
