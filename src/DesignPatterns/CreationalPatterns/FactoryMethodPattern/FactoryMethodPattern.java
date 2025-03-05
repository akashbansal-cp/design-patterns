package DesignPatterns.CreationalPatterns.FactoryMethodPattern;


import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Factory.CarFactory;
import DesignPatterns.CreationalPatterns.FactoryMethodPattern.Vehicle.Factory.FactoryMethod;

public class FactoryMethodPattern {
    
    FactoryMethod carFactory = new CarFactory();

    public void doStuff(){
        carFactory.build();
    }


}
