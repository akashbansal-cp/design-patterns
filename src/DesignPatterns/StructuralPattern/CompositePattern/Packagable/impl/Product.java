package DesignPatterns.StructuralPattern.CompositePattern.Packagable.impl;

import DesignPatterns.StructuralPattern.CompositePattern.Packagable.Packable;

public class Product implements Packable {

    String productName;
    Integer price;


    @Override
    public Integer calculatePrice() {
        return price;
    }
}
