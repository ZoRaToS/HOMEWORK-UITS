package com.lesson7.by_delwaidr;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Vladimir");
        person1.talk();
        person1.move();
        person1.setAge(30);
        System.out.println(" ему "+person1.getAge()+" лет");
    }
}
