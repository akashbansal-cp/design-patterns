package DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Factory;

import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Vehicle;

public abstract class FactoryMethod {

    public Vehicle build(){
        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;

    }

    public abstract Vehicle createVehicle();


}
