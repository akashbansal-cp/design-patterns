package DesignPatterns.StructuralPattern.FacadePattern.ComplexSubsystem;

import java.util.Objects;

public class LockingSystem {

    String currentLockHolder = null;
    private final String lockOwner;

    LockingSystem(String lockOwner) {
        this.lockOwner = lockOwner;
    }

    void holdLock(String newLockHolder) {
        if (Objects.nonNull(currentLockHolder)) {
            throw new IllegalCallerException("lock already hold by someone");
        }
        currentLockHolder = newLockHolder;
        System.out.println("lock is hold for " + lockOwner);

    }

    void releaseLock(String oldLockHolder) throws IllegalAccessException {
        if (Objects.isNull(currentLockHolder) || !currentLockHolder.equals(oldLockHolder)) {
            throw new IllegalAccessException("lock is not hold by you");
        }
        currentLockHolder = null;
        System.out.println("lock is released for " + lockOwner);
    }

    boolean isSystemLocked() {
        return Objects.nonNull(currentLockHolder);
    }

}
