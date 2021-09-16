package vehicles;

public class GarageTest {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        Airship airship1 = new Airship("Hilda Garde II");
        Chocobo chocobo1 = new Chocobo("Boco");
        Chocobo chocobo2 = new Chocobo("Choco");
        Submarine submarine1 = new Submarine();
        vehicles[0] = airship1;
        vehicles[1] = chocobo1;
        vehicles[2] = chocobo2;
        vehicles[3] = submarine1;

        Garage garage = new Garage();
        garage.alarmCascade(vehicles);
    }

}
