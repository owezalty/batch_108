package day20accessmodifiersinheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat c = new Cat();

        c.eat();
        c.drink();
        c.meow();

        Dog doggy = new Dog();
        doggy.eat();
        doggy.drink();
        doggy.bark();

        Bird birdie = new Bird();
        birdie.eat();
        birdie.drink();
        birdie.tweet();


    }

    /*
        1) We use "inheritance";
            i)to prevent "repetition"
            ii)to make "maintenance" easy
            iii)to make our classes "atomic"
        2)To make a class child of another class we use "extends" keyword

        3)Child classes can use class members from the parent classes
        However parent classes cannot use anything from child classes.

        4)Every class except "Object Class" in Java has at least one parent class which is "Object class"

        5)Inheritance Types in Java;
            1) Multilevel Inheritance

     */


}
