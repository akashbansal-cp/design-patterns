package DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Factory;

import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Vehicle;
import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.impl.Bus;

public class BusFactory extends FactoryMethod{
    @Override
    public Vehicle createVehicle() {
        return new Bus(8, "UPSRTC");
    }
}
