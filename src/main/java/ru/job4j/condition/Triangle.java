package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double bc, double ac) {
        return ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac));
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(2, 3, 4);
        System.out.println(result);
    }
}




