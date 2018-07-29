package com.lesson5.by_delwaidr;

import java.util.Arrays;
import java.util.Scanner;

import static com.lesson5.by_delwaidr.Task16.arraySortBublle;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.println("Ваш исходный массив для сортировки");
        arrayInitOutPut(N, array);
        System.out.println();
        System.out.println("'1' -по убыванию\n" + "'2'- по возростанию");
        byte typeSort = scanner.nextByte();
        arraySortBublle(N, array, typeSort);
    }

    public static void arrayInitOutPut(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void arraySortBublle(int n, int[] array, byte typeSort) {
        int buf;
        if (typeSort == 1) {
            for (int i = 0; i < n; i++) {
                /**
                 * Проход цикла начиная с конца массива
                 * Сортировка по убыванию
                 */
                for (int j = n - 1; j > i; j--) {
                    if (array[j - 1] < array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                    /**
                     * Проход цикла начиная с начала массива работает не корректно
                     */
           /* for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
                System.out.print(array[i] + "\t");
            }*/

                }
                System.out.print(array[i] + "\t");
            }
        }
        if (typeSort == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
                System.out.print(array[i] + "\t");
            }
        }
    }
}