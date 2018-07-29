package com.lesson5.by_delwaidr;

import java.util.Arrays;

public class Task17 {
    static int min, max;

    public static void main(String[] args) {
        int kol_strok = 5, kol_st = 8;
        int array[][] = new int[kol_strok][kol_st];
        int array2[][] = new int[kol_strok][2];


        arrayInit(kol_strok, kol_st, array);
        arrayOutPut(kol_strok, kol_st, array);
        System.out.println();
        arraySerchMin(kol_strok, kol_st, array);
        System.out.println();
        arraySerchMax(kol_strok, kol_st, array);
        array2Init( kol_strok, 2, array2);
    }

    /**
     * Метод для инициализации исходного массива
     *
     * @param kol_strok
     * @param kol_st
     * @param array
     */
    public static void arrayInit(int kol_strok, int kol_st, int[][] array) {
        for (int i = 0; i < kol_strok; i++) {
            for (int j = 0; j < kol_st; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    /**
     * Метод для вывода исходного массива на консоль
     *
     * @param kol_strok
     * @param kol_st
     * @param array
     */
    public static void arrayOutPut(int kol_strok, int kol_st, int[][] array) {
        for (int i = 0; i < kol_strok; i++) {
            System.out.println();
            for (int j = 0; j < kol_st; j++) {
                System.out.print(array[i][j] + "\t");
            }

        }
    }

    /**
     * Метод для поиска минимального числа в строке массива
     *
     * @param kol_strok
     * @param kol_st
     * @param array
     */
    public static void arraySerchMin(int kol_strok, int kol_st, int[][] array) {
        for (int i = 0; i < kol_strok; i++) {
            min = array[i][0];
            for (int j = 0; j < kol_st; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            // System.out.print(min + "\t");
        }
    }

    /**
     * Метод для поиска максимального числа в строке массива
     *
     * @param kol_strok
     * @param kol_st
     * @param array
     */

    public static void arraySerchMax(int kol_strok, int kol_st, int[][] array) {
        for (int i = 0; i < kol_strok; i++) {
            max = array[i][0];
            for (int j = 0; j < kol_st; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            //System.out.print(max + "\t");
        }

    }

    public static void array2Init(int kol_strok, int kol_st, int[][] array2) {
        for (int i = 0; i < kol_strok; i++) {
            for (int j = 0; i < kol_st; j++) {
                array2[i][0] = max;
                array2[i][1] = min;

            }

            System.out.println(array2[kol_strok][kol_st] + "\t");
        }
    }


}
