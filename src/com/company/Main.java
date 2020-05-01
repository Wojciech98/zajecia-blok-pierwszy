package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();

        Human human = new Human();
        Car BMW = new Car();


        human.addMyCar(BMW);

        System.out.println("________________________");
        human.getSalary();

    }
}
