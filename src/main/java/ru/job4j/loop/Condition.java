package ru.job4j.loop;

public class Condition {

    public class BonusCupCoffee {
        public static int countCup(int count, int n) {
            if (count > n){
                return count += count / n;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        int a = BonusCupCoffee.countCup(7,6);
        System.out.println(a);
    }
}
