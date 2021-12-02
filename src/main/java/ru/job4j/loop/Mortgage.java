package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (amount > 0){
            percent = amount * percent * 0.01;
            amount = (amount + percent) - salary;
            if(amount > 0){
                year++;
            }
        }
        return year;
    }

}