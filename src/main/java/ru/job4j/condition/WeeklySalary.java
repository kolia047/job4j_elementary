package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int summa = 0;
        int summaOvertime = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8) {
                summaOvertime = summaOvertime + ((hours[i] - 8) * 15);
                summaOvertime = summaOvertime + 80;
            } else if (hours[i] <= 8 ) {
                summa = summa + (hours[i] * 10);
            }
        }
        for (int i = 5; i < 7; i++) {
            if (hours[i] > 8) {
                summaOvertime = summaOvertime + ((hours[i] - 8) * 30);
                summaOvertime = summaOvertime + 160;
            } else if (hours[i] <= 8 ) {
                summa = summa + (hours[i] * 20);
            }
        }
        return summa + summaOvertime;
    }
}

