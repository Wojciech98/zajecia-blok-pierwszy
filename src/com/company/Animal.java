package com.company;



public class Animal {


    String species="dog";
    private Double weight;

    public Animal() {
        this.weight = 10.0;
    }

    void feed(){

        weight+=2;


    }

    void takeForAWalk(){

        if(weight>0) {
            weight -= 2;
            System.out.println("add 2kg");

            System.out.println("My weight="+weight);
        }else{
            System.out.println("Ziom, nie mam masy!!!");
        }
    }

    public String toString(){
        return species+" "+weight;
    }
}
