package DesignPatterns.StructuralPattern.BridgePattern.OS.impl;

import DesignPatterns.StructuralPattern.BridgePattern.OS.OS;

public class MacOS implements OS {
    @Override
    public void openApplication() {
        System.out.println("opening mac app");
    }

    @Override
    public void closeApplication() {
        System.out.println("closing mac app");
    }

    @Override
    public void minimizeApplication() {
        System.out.println("minimizing mac app");
    }

    @Override
    public void shutDown() {
        System.out.println("shutting down mac");
    }

    @Override
    public void suspend() {
        throw new UnsupportedOperationException("suspend not supported without paying");
    }

}
