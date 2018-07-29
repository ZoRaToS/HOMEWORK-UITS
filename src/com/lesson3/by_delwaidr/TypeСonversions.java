package com.lesson3.by_delwaidr;

public class TypeСonversions {
    public static void main(String[] args) {
        intTobyte();
        intToshort();
        longToint();
        byteTodouble();
        floatToint();
        сharTofloat();
    }

    //преобазование int в byte
    public static void intTobyte() {
        int i = 300;
        byte b = (byte) i;
        System.out.println("int в byte");
        System.out.println("i= " + i + " b= " + b);
    }

    //преобазование int в short
    public static void intToshort() {
        int i = 300;
        short s = (short) i;
        System.out.println("int в short");
        System.out.println("i= " + i + " s= " + s);
    }

    //преобазование long в int
    public static void longToint() {
        long l = 687698797979873L;
        int i = (int) l;
        System.out.println("long в int");
        System.out.println("l= " + l + " i= " + i);
    }

    //преобазование byte в double
    public static void byteTodouble() {
        byte b = 15;
        double d = (double) b;
        System.out.println("byte в double");
        System.out.println("b= " + b + " d= " + d);
    }

    //преобазование float в int
    public static void floatToint() {
        float f = 3.88675f;
        int i = (int) f;
        System.out.println("float в int");
        System.out.println("f= " + f + " i= " + i);

    }

    public static void сharTofloat() {
        char ch = 'F';
        float f = (float) ch;
        System.out.println("float в int");
        System.out.println("ch= " + ch + " f= " + f);
    }
}