package ru.job4j.loop;

public class Vultipliers {

    public static int out(int n) {
        int result = 1;
        for(int i=1; i<=n; i++){
            if((n % i) ==0){
                result++;
                System.out.println(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int a=Vultipliers.out(2);




    }
}

