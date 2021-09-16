package vehicles;

public class Airship extends Vehicle {
    public Airship(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println("SSSHHHHHHHAAAAAA");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("ASJHFKJABSJ");
    }
}
