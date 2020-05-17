package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Animal() {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();

        Animal animal_1 = new Animal() {
            @Override
            public void feed(Double foodWeight) {

            }
        };


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

        Human human = new Human();
        human.addMyCar(bmw_1);
        human.getSalary();
        System.out.println("________________________");


        System.out.println(human.toString());
        System.out.println(bmw_1.toString());
        System.out.println(animal.toString());


        System.out.println("-----------------------------");


        Device device = new Device() {
            @Override
            public boolean turnOn() {
                System.out.println("Turn On");
                return true;
            }
        };

        device.turnOn();

        Phone phone = new Phone();
        phone.setModel("Nokia");

        Human seller = new Human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.setSalary(0.0);

        Human buyer = new Human();
        buyer.setSalary(1000.0);
        buyer.setCash();

        System.out.println("---------------");


        animal.salleable.sell(seller, buyer, 100.0);
        System.out.println("---------------");
        animal_1.salleable.sell(seller, buyer, 200.0);
        System.out.println("---------------");
        opel.salleable.sell(seller, buyer, 100.0);
        System.out.println("---------------");
        System.out.println("buyer money:" + buyer.getCash());
        System.out.println("seller money:" + seller.getCash());

        System.out.println(buyer.pet.toString());


    }
}
