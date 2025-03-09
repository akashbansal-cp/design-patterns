package DesignPatterns.StructuralPattern.FacadePattern.ComplexSubsystem;

public class FileAccessSystem {

    String systemName = "file_system";
    LockingSystem lockingSystem = new LockingSystem(systemName);

    public String getFileContent(String fileName, String accessKey) throws IllegalAccessException {
        if (lockingSystem.isSystemLocked()) {
            throw new IllegalStateException(systemName + " is already locked");
        }
        lockingSystem.holdLock(accessKey);

        // get file data
        String fileData = fileName + "fileData";
        System.out.println("file read for fileName: " + fileName);

        lockingSystem.releaseLock(accessKey);

        return fileData;
    }

}
