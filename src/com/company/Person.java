package com.company;

public class Person {
    private int age;
    private String name;
    private Nation nation;

    public Person(int age, String name, Nation nation) {
        this.age = age;
        this.name = name;
        this.nation = nation;
    }

    public String info(){
        return getName() + " " + getAge() + " " + getNation();
    }

    public Nation getNation() {
        return nation;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
