package day24interfaces;

public class CarRunner {

    public static void main(String[] args) {


        System.out.println(Ac.price);

        System.out.println(Brake.price);

        System.out.println(Engine.price);

        System.out.println(Brake.luxury);

        Honda honda = new Honda();
        System.out.println(honda.calculate());//1200

        System.out.println(Ac.climate());


    }
}
