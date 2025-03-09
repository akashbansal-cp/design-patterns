package DesignPatterns.StructuralPattern.FacadePattern;

import DesignPatterns.StructuralPattern.FacadePattern.File.File;
import DesignPatterns.StructuralPattern.FacadePattern.File.impl.Facade;

public class FacadePattern {

    public static void main(String[] args) throws IllegalAccessException {
        File file = new Facade();
        file.printFileOnScreen("fileName", "akash");
    }

}
