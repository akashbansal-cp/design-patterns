package DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.impl;

import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Vehicle;

public class Bus implements Vehicle {

    Integer numberOfTyres;
    String owner;

    public Bus(Integer numberOfTyres, String owner) {
        this.numberOfTyres = numberOfTyres;
        this.owner = owner;
    }

    @Override
    public void build() {
        System.out.println("bus is built with numberOfTyres " + numberOfTyres + " and owner as " + owner);
    }
}
