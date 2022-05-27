package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int second, int third) {
        return max(left, max(second, third));
    }

    public static int max(int left, int second, int third, int four) {
        return max(left, max(second, third, four));
    }

    public static void main(String[] args) {
        int end = Max.max(24, 45, 53, 112);
        System.out.println(end);
    }
}
