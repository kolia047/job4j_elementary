package ru.job4j;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ru.job4j.ArgMethod.hello(name, age);
        ru.job4j.ArgMethod.hello(name, age);
        ru.job4j.ArgMethod.hello(name, age);
        ru.job4j.ArgMethod.hello(name, age);
    }
}
