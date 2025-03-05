package DesignPatterns.CreationalPatterns.SingletonPattern;

// Not Thread-safe
public class LazyInitialization {

    private static LazyInitialization instance = null;

    public static LazyInitialization getInstance() {
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}
