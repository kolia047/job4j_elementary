package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int proiz = 1;
        for(int m=a; m<=b; m++){
            proiz *= m;
            System.out.println(proiz);
        }

        return proiz;
    }

    public static void main(String[] args) {
        int a = MultiplicationLoop.mult(0,8);
    }

}
