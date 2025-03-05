package DesignPatterns.CreationalPatterns.FactoryPattern.Factory;

import DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.Vehicle;
import DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.impl.Car;
import DesignPatterns.CreationalPatterns.FactoryPattern.Vehicle.impl.MotorCycle;

public class Factory {

    public Vehicle createVehicle(String vehicleType){
        if(vehicleType.equals("CAR"))
            return new Car();
        else if(vehicleType.equals("MOTORCYCLE"))
            return new MotorCycle();
        throw new IllegalArgumentException("No such vehicleType supported");
    }

}
