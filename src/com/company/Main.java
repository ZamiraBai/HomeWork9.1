package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(38, "Ilim", Nation.KYRGYZ);
        System.out.println(p1.info());

        Man m1 = new Man(24,"Bakyt", Nation.RUSSIAN, "Teacher", 178);
        System.out.println(m1.info());
        m1.drive();
        m1.drive("gh",5);

        Woman w1 = new Woman(32, "Tera", Nation.CHINESE, "Doctor", 175, 58);
        System.out.println(w1.info());
        w1.drive();
        w1.cook();
    }
}
