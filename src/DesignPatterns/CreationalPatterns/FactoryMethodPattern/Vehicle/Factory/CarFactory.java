package DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Factory;

import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Vehicle;
import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.impl.Car;

public class CarFactory extends FactoryMethod{

    @Override
    public Vehicle createVehicle() {
        return new Car(4);
    }
}
