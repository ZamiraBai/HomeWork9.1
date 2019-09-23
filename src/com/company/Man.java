package com.company;

public class Man extends Person {

    private String profession;
    private int height;

    public Man(int age, String name, Nation nation, String profession, int height) {
        super(age, name, nation);
        this.profession = profession;
        this.height = height;
    }

    @Override
    public String info() {
        return super.info() + " " + getProfession() + " " + getHeight();
    }

    public void drive() {
        System.out.println("Хорошо водит машину");
    }

    public void drive(String string, int numbers) {
        for (int i = 0; i <numbers ; i++) {
            System.out.println("Умеет быстро ездить");
        }
    }

    public String getProfession() {
        return profession;
    }

    public int getHeight() {
        return height;
    }
}
