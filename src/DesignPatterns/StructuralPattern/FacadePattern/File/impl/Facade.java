package DesignPatterns.StructuralPattern.FacadePattern.File.impl;

import DesignPatterns.StructuralPattern.FacadePattern.ComplexSubsystem.FileAccessSystem;
import DesignPatterns.StructuralPattern.FacadePattern.ComplexSubsystem.ScreenSystem;
import DesignPatterns.StructuralPattern.FacadePattern.File.File;

public class Facade implements File {

    private final FileAccessSystem fileAccessSystem = new FileAccessSystem();
    private final ScreenSystem screenSystem = new ScreenSystem();

    @Override
    public void printFileOnScreen(String fileName, String accessKey) throws IllegalAccessException {
        String fileData = fileAccessSystem.getFileContent(fileName, accessKey);
        screenSystem.printDataOnScreen(fileData, accessKey);
    }
}
