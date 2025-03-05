package DesignPatterns.CreationalPatterns.BuilderPattern;

import lombok.Builder;
public class Car {

    String str1;
    String str2;

    private Car(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public static class CarBuilder{

        String str1;
        String str2;

        CarBuilder(){

        }

        public CarBuilder str1(String str1){
            this.str1 = str1;
            return this;
        }

        public CarBuilder str2(String  str2){
            this.str2 =str2;
            return this;
        }

        Car build(){
            return new Car(this.str1, this.str2);
        }


    }

}
