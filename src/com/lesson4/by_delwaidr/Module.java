package com.lesson4.by_delwaidr;

import java.util.Scanner;

/**
 * Программа ищет наименьшее по модулю число, введенное пользователем
 */
public class Module {
    public static void main(String[] args) {
        double a, b, c, m_a, m_b, m_c, min;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = scn.nextDouble();
        System.out.print("Введите число b: ");
        b = scn.nextDouble();
        System.out.print("Введите число c: ");
        c = scn.nextDouble();
        m_a = a < 0 ? -a : a;
        m_b = b < 0 ? -b : b;
        m_c = c < 0 ? -c : c;
        System.out.println("Моуль числа а: " + m_a);
        System.out.println("Моуль числа b: " + m_b);
        System.out.println("Моуль числа c: " + m_c);

        if (m_a < m_b && m_b < m_c) {
            min = m_a;
        } else if (m_a < m_c) {
            min = m_a;
        } else {
            min = m_c;
        }
        System.out.println("минимальный модуль числа: "+min);
    }
}

