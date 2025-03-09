package DesignPatterns.StructuralPattern.FacadePattern.ComplexSubsystem;

public class ScreenSystem {

    String systemName = "screen";
    LockingSystem lockingSystem = new LockingSystem(systemName);

    public void printDataOnScreen(String data, String accessKey) throws IllegalAccessException {
        if (lockingSystem.isSystemLocked()) {
            throw new IllegalStateException("screen already locked");
        }
        lockingSystem.holdLock(accessKey);

        // print data on screen
        System.out.println("printing data on screen");
        System.out.println(data);

        lockingSystem.releaseLock(accessKey);
    }

}
