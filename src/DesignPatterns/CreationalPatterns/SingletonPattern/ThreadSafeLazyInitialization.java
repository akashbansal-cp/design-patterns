package DesignPatterns.CreationalPatterns.SingletonPattern;


public class ThreadSafeLazyInitialization {
    private static ThreadSafeLazyInitialization instance;

    public ThreadSafeLazyInitialization getInstance(){
        if(instance == null){
            synchronized (this){
                if(instance == null){
                    instance = new ThreadSafeLazyInitialization();
                }
            }
        }
        return instance;
    }

}
