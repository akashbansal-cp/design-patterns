package DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.impl;

import DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("car is started");
    }

    @Override
    public void drive() {
        System.out.println("car is being driven");
    }

    @Override
    public void stop() {
        System.out.println("car stopped");
    }
}
