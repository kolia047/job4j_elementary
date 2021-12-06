package ru.job4j.loop;

public class Game {

    public static int checkGame(double percent, int prize, int pay) {

        if ((percent * prize) > pay){
            return (int) ((percent*prize) - pay);
        }

         return 0;

    }

    public static void main(String[] args) {
        int a = Game.checkGame(0.9,1,2);
        System.out.println(a);
    }
}

