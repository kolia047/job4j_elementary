package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int i;
        int sum=a;
        for(i=1; i <= n; i++){
           sum *= sum;

        }

        return sum;
    }

    public static void main(String[] args) {
        int a = DegreeLoop.calculate(2,2);
        System.out.println(a);
    }
}
