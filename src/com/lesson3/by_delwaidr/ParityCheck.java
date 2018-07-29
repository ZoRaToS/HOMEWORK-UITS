package com.lesson3.by_delwaidr;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        parityCheck();
    }

    public static void parityCheck() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число с клавиатуры: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if ((a & 1) == 0) {
                System.out.println("Вы ввели четное число!");
            } else {
                System.out.println("Вы ввели не четное число ");
            }
        } else System.out.println("Вы ввели НЕ целое число или сивол");


    }
}
