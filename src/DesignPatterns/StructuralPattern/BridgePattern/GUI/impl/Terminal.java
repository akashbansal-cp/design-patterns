package DesignPatterns.StructuralPattern.BridgePattern.GUI.impl;

import DesignPatterns.StructuralPattern.BridgePattern.GUI.GUI;
import DesignPatterns.StructuralPattern.BridgePattern.OS.OS;
import DesignPatterns.StructuralPattern.BridgePattern.OS.impl.Linux;

public class Terminal implements GUI
{

    OS os = new Linux();


    @Override
    public void openApplication() {
        os.openApplication();
    }

    @Override
    public void closeApplication() {
        os.closeApplication();
    }

    @Override
    public void suspend() {
        os.suspend();
    }
}
