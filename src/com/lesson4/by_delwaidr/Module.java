package com.lesson4.by_delwaidr;

import java.util.Scanner;

/**
 * Программа ищет наименьшее по модулю число, введенное пользователем
 */
public class Module {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = scn.nextDouble();
        System.out.print("Введите число b: ");
        b = scn.nextDouble();
        System.out.print("Введите число c: ");
        c = scn.nextDouble();
        minModule(a, b, c);
    }

    public static void minModule(double a, double b, double c) {
        double m_a;
        double m_b;
        double m_c;
        double min;
        m_a = a < 0 ? -a : a;
        m_b = b < 0 ? -b : b;
        m_c = c < 0 ? -c : c;
        System.out.println("Моуль числа а: " + m_a);
        System.out.println("Моуль числа b: " + m_b);
        System.out.println("Моуль числа c: " + m_c);

        if (m_a < m_b && m_a < m_c) {
            min = m_a;
        } else if (m_b < m_c && m_b < m_a) {
            min = m_b;

        } else {
            min = m_c;
        }
        System.out.println("минимальный модуль числа: " + min);
        System.out.println("Вычисление с помощью метода Math.min");
        System.out.println("минимальный модуль числа: " + Math.min(m_a, Math.min(m_b, m_c)));
    }
}

