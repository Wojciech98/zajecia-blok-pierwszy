package com.company;

import com.company.devices.Car;

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

        Car bmw_1 = new Car();
        bmw_1.setColour("red");
        bmw_1.setModel("e46");
        bmw_1.setPrice(400);
        bmw_1.setProducer("Bayerische Motoren Werke");

        Car bmw_2 = new Car();
        bmw_2.setColour("red");
        bmw_2.setModel("e46");
        bmw_2.setPrice(400);
        bmw_2.setProducer("Bayerische Motoren Werke");



        Car opel = new Car();
        opel.setColour("blue");
        opel.setModel("corsa");
        opel.setPrice(999);
        opel.setProducer("Groupe PSA");


        human.addMyCar(bmw_1);

        System.out.println("________________________");
        human.getSalary();

        //System.out.println(bmw_1.getColour()+" "+bmw_1.getModel()+" "+bmw_1.getProducer()+"  "+bmw_1.getPrice());
        System.out.println("________________________");

        System.out.println(human.toString());
        System.out.println(bmw_1.toString());
        System.out.println(animal.toString());

    }
}
