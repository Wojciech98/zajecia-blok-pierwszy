package com.company;


import java.util.Date;

public class Human {

    Animal pet;
    Car myCar;
    Double salary;

    Date date = new Date();


    void addMyCar(Car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("value must be positive");
        } else {
            System.out.println("New salary send to bookkeeping ");
            System.out.println("You must take annex to the contract from Hania");
            System.out.println("Zus and US now know payout changes ");

            return salary;
        }
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }

    public Double getSalry() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }
}
