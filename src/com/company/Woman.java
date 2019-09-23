package com.company;

public final class Woman extends Man {
    private int weight;

    public Woman(int age, String name, Nation nation, String profession, int height, int weight) {
        super(age, name, nation, profession, height);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String info() {
        return super.info() + " " + getWeight();
    }

    @Override
    public void drive() {
        System.out.println("Умеет кататься на велосипеде");
    }

    @Override
    public void drive(String string, int numbers) {
        for (int i = 0; i < numbers; i++) {
            System.out.println("Умеет кататься на скейте");
        }
    }
    public final void cook(){
        System.out.println("Умеет готовить пироги");
    }
}
