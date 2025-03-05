package DesignPatterns.StructuralPattern.BridgePattern.OS.impl;

import DesignPatterns.StructuralPattern.BridgePattern.OS.OS;

public class Linux implements OS {
    @Override
    public void openApplication() {
        System.out.println("opening linux app");
    }

    @Override
    public void closeApplication() {
        System.out.println("closing linux app");
    }

    @Override
    public void minimizeApplication() {
        System.out.println("minimizing linux app");
    }

    @Override
    public void shutDown() {
        System.out.println("shutting down linux");
    }

    @Override
    public void suspend() {
        System.out.println("suspending Linux");
    }
}
