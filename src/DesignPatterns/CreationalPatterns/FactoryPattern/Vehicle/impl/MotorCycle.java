package DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.impl;

import DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.Vehicle;

public class MotorCycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("motorcycle started");
    }

    @Override
    public void drive() {
        System.out.println("motorcycle is being driven");
    }

    @Override
    public void stop() {
        System.out.println("motorcycle stopped");
    }
}
