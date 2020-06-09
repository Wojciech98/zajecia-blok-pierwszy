package com.company.creatures;


import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class Human implements Comparator<Car> {

    public Animal pet;
    private ArrayList<Car> garage;
    public Car car;

    public ArrayList<Car> getGarage() {
        return garage;
    }

    public void setGarage(ArrayList<Car> garage) {
        this.garage = garage;
    }

    public Double salary;
    double cash;
    Phone phone;
    Date date = new Date();


    public String toString() {
        return pet + " " + garage + "  " + salary;
    }

    public Human() {
        this.garage = new ArrayList(4);

    }


    public Human(int initialCapacity) {
        this.garage = new ArrayList(initialCapacity);
    }

    public void garageValue() {

        double value;
        for (int i = 0; i < garage.size(); i++) {

           value =+ garage.get(i).getPrice();

            System.out.print(value);
        }


    }
    public int compare(Car car_a, Car car_b)
    {
        return car_a.getYear() - car_b.getYear();
    }


    public List<Car> sortCarByYear(){

        Collections.sort(garage, this::compare);
        Collections.reverse(garage);
        System.out.println("Sorted by year");
        for (int i=0; i<garage.size(); i++)
            System.out.println(garage.get(i));

        return garage;
    }

    public List<Car> addMyCar(Car car, int index) {

        garage.add(index, car);

        return garage;
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

    public Car getMyGarage(int index) {


        return garage.get(index);
    }


    public void setMyCar(Car car, int index) {

        //  garage.add(index,car);
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
