package com.lesson4.by_delwaidr;

public class Garland {
    static int lamps = -2147483648 + (int) (Math.random() * 214748364);

    public static void main(String[] args) {

        System.out.println("Случайное количество вкл. лампочек");
        System.out.println(Integer.toBinaryString(lamps));
        // flashingLamps();
        runningLights();
        currentState();
    }

    //метод выполняет мигание лампочек путем инвертирования битов
   /* public static void flashingLamps() {
        int inv = ~lamps;
        System.out.println(Integer.toBinaryString(inv));

    }*/

    //метод выполняет режим бугущих огней путем побитового сдвига влево
    public static void runningLights() {
        lamps = lamps << 4;
        System.out.println("Режим бегущих огней");
        System.out.println(Integer.toBinaryString(lamps));
    }
    //метод отображает текещее состояние гирлянды
    public static void currentState() {
        System.out.println("Текущее состояние гирлянды");
        System.out.println(Integer.toBinaryString(lamps));
    }

}
