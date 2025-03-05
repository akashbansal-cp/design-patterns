package DesignPatterns.CreationalPatterns.BuilderPattern;

public class BuilderImpl {

    void doStuff(){
        Car c = new Car.CarBuilder()
                .str1("hello")
                .str2("bye")
                .build();
    }

}
