package vehicles;

public class Chocobo extends Vehicle {
    public Chocobo(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("KWEH");
    }
}
