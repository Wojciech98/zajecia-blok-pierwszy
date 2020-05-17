package com.company.creatures;


import com.company.Salleable;

public abstract class Animal implements Feedable {

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("I don't have an animal for sale");
                } else {
                    System.out.println("I  have an animal for sale");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getMyCar() == null) {
                    System.out.println("I don't have a car for sale");
                } else {
                    System.out.println("I  have a car for sale");
                }

                if (seller.getPhone() == null) {
                    System.out.println("I don't have a phone for sale");
                } else {
                    System.out.println("I  have a phone for sale");
                }
            }else {
                System.out.println("You do not have enough money");
            }


        }

    };


    String species = "dog";
    private Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public Animal() {
        this.weight = 10.0;
    }

   public void feed() {

        weight += 2;


    }

  public   void takeForAWalk() {

        if (weight > 0) {
            weight -= 2;
            System.out.println("add 2kg");

            System.out.println("My weight=" + weight);
        } else {
            System.out.println("Ziom, nie mam masy!!!");
        }
    }

    public String toString() {
        return species + " " + weight;
    }
}
