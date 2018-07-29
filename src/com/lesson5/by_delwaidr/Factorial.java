package com.lesson5.by_delwaidr;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.println("Факториал введенного вами числа: " + fatorial(n));
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

    public static int fatorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
