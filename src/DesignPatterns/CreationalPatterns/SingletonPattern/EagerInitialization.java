package DesignPatterns.CreationalPatterns.SingletonPattern;


// Class only with single Instance in the whole code
// may be used for Logger and other things

// Not Thread-safe
public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){};

    public EagerInitialization getInstance(){
        return instance;
    }


}
