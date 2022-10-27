package day24interfaces;

public class Honda implements Ac, Brake, Engine{

    @Override
    public void digital() {
        System.out.println("This is digital AC");
    }

    @Override
    public void secureBrake() {
        System.out.println("It stops securely");
    }

    @Override
    public void ecoEngine() {
        System.out.println("It has eco Engine");
    }

    @Override
    public void price() {
        System.out.println("Brake Price");
    }

}
