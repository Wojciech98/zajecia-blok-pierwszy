package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Pet();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();

        Animal animal_1 = new FarmAnimal("pig",20.0);


        Car bmw_1 = new Disel();
        bmw_1.setColour("red");
        bmw_1.setModel("e46");
        bmw_1.setPrice(400);
        bmw_1.setProducer("Bayerische Motoren Werke");

        Car bmw_2 = new LPG();
        bmw_2.setColour("red");
        bmw_2.setModel("e46");
        bmw_2.setPrice(400);
        bmw_2.setProducer("Bayerische Motoren Werke");

        Car opel = new Electric();
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


        Device device = new Phone();

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

        System.out.println(Phone.serverAddress);


    }
}
