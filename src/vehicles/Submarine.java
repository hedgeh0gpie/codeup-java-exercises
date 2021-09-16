package vehicles;

public final class Submarine extends Vehicle {

    public Submarine() {

    }

    public Submarine(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(this.name + " goes GLUG GLUG");
        super.makeNoise();

    }


}
