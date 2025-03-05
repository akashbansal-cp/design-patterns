package DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.impl;

import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Vehicle;

public class Car implements Vehicle {

    Integer numberOfTyres;

    public Car(Integer numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    @Override
    public void build() {
        System.out.println("car is built with numberOfTyres " + numberOfTyres);
    }
}
