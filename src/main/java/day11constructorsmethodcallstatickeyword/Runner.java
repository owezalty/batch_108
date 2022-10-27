package day11constructorsmethodcallstatickeyword;

public class Runner {

    public static void main(String[] args) {

        //Create an object from "Car" class
        Car audi = new Car();
        System.out.println(audi.make);

        Car bmw = new Car("BMW","m5",2022,50000);
        System.out.println(bmw.make);

        Car itCar = new Car("Rolls Royce", "M500", 2023);
        System.out.println(itCar.make);
        System.out.println(itCar.model);
        System.out.println(itCar.year);

        Static01 obj01 = new Static01();
        Static01 obj02 = new Static01();
        Static01 obj03 = new Static01();

        System.out.println(obj01.nonStaticCounter);
        System.out.println(obj01.staticCounter);


    }
}
