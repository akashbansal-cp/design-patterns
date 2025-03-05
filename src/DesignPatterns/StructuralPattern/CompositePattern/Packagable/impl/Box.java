package DesignPatterns.StructuralPattern.CompositePattern.Packagable.impl;

import DesignPatterns.StructuralPattern.CompositePattern.Packagable.Packable;

import java.util.List;
import java.util.Objects;

public class Box implements Packable {
    Product product;
    List<Box> boxes;


    @Override
    public Integer calculatePrice() {
        Integer totalPrice = 0;
        if (Objects.nonNull(product)) {
            totalPrice = totalPrice + product.calculatePrice();
        }
        if (Objects.nonNull(boxes)) {
            for (Box box : boxes) {
                totalPrice = totalPrice + box.calculatePrice();
            }
        }
        return totalPrice;
    }
}
