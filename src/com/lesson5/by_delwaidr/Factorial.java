package com.lesson5.by_delwaidr;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = getNextIntegerNumber(scanner);
        System.out.println("Факториал числа " + n + " равен: " + fatorial(n));
    }

    private static int getNextIntegerNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число. Повторите пожалуйста ввод:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int fatorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
