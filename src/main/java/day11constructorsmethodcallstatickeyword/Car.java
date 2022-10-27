package day11constructorsmethodcallstatickeyword;

public class Car {

    /*
    When you create a class you will us it to create
    an object most probably, Java knows it.
    Because of that when you create a class Java puts
    "constructor" in it automatically, its name is
    "Default Constructor". Default constructors are invisible.

    If you create your own constructor, Java deletes
    the "Default Constructor".
     */

    //How to create "constructor"
    //Note: Constructor name must match with the class name.
    //Note: Constructors do not have "return type" but methods have
    //Note: Method names can be any name.
    //Note: Constructors are used to create objects but methods are used to create some actions.

    //Note: If any class you want to use, is in the same package no need to import
    //But if the class is in the different package, you have to import it.

    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 20000;


    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }






}
