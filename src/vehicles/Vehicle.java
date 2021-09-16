package vehicles;//Create a vehicles.Vehicle class with two properties: a name instance variable and a makeNoise() method.
// The instance variable should be private and have getters and setters (in IntelliJ try cmd-N).
// The makeNoise method should just sout out a typical vehicle noise.
// Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever.
// Make the specific vehicle class extend the vehicles.Vehicle class.
// Otherwise, keep it empty.
// Create a test class, perhaps calling it vehicles.VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle.
// Notice the inherited method works and the inherited name property is assignable on the subclass.

//Bonus:
//Create a findVehicle method
//The findVehicle method should be part of the vehicles.Garage class
//It takes a string and an array of Vehicles
//
//It returns the vehicle that the customer is looking for (the vehicle the name of which matches the string).
//        If the vehicle is not in the garage, it returns a vehicles.Vehicle with a null name

//Create a name-setter in your vehicle subclass. In your vehicle test, instantiate a specific vehicle and set its name. Sout out the name and verify that you do not get a stack overflow.
public class Vehicle {
    protected String name;

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("VROOOM");
    }

    public Vehicle(String name){
        this.name = name;
        System.out.println("A new vehicle has been created.");
    }


}
