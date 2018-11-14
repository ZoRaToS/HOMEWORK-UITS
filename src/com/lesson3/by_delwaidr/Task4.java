package com.lesson3.by_delwaidr;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        sumOFnumbers();
    }

    public static void sumOFnumbers() {
        int a = 0, b = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число а");
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            System.out.println("Введите число b");
            b = scn.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }
        System.out.println("Сумма равна: " + (a + b));

    }
}
