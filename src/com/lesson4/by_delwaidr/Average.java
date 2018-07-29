package com.lesson4.by_delwaidr;

public class Average {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        System.out.println("Первое число: " + a);
        double b = Double.parseDouble(args[1]);
        System.out.println("Второе число: " + b);
        double c = Double.parseDouble(args[2]);
        System.out.println("Третье число: " + c);
        double avg = (a + b + c) / 3;
        System.out.print("Среднее значение : " + avg);


    }


}
