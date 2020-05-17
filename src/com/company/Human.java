package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {

    Animal pet;
    private Car myCar;
    Double salary;
    double cash;
    Phone phone;


    Date date = new Date();

    public String toString() {
        return pet + " " + myCar + "  " + salary;
    }


    public Human() {
    }

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

            return this.salary = salary;
        }
        return this.salary = salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        if (salary >= myCar.price) {
            System.out.println("You can buy new car!");
            addMyCar(myCar);
        } else if (salary > (myCar.price / 12)) {
            System.out.println("You can buy new car for credit");
            addMyCar(myCar);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public double getCash() {
        return cash + salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }

    public void setCash() {
        this.cash = cash + cash;
    }
}
