package vehicles;

public class Garage {
    Vehicle[] vehicles;

    public void alarmCascade(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.makeNoise();
        }
    }
}
