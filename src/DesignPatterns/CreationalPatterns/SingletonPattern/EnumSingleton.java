package DesignPatterns.CreationalPatterns.SingletonPattern;

public enum EnumSingleton {
    INSTANCE ("some info");

    public final String info;

    EnumSingleton(String info){
        this.info = info;
    }

    EnumSingleton getInstance(){
        return INSTANCE;
    }
}
