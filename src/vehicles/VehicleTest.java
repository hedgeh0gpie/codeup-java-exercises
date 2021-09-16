package vehicles;//Create a Car class if you have not already done so. It should be a subclass of vehicles.Vehicle.
//Create a vehicles.Garage class with two properties.
// It should have a vehicles.Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence.
// Create a vehicles.GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles.
// Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method.
// Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.
// Create a name-setter in your vehicle subclass. In your vehicle test, instantiate a specific vehicle and set its name. Sout out the name and verify that you do not get a stack overflow.

//Create a new kind of vehicle that extends vehicle. Define the class as final. Create a makeNoise method that overrides the superclass method. Test it in your vehicles.VehicleTest class. Now alter it so your subclass makeNoise method calls the superclass makeNoise method in addition to its own noise. Add one of your new kinds of vehicles to the array of vehicles in your vehicles.Garage or Marina or Hangar and trigger the alarmCascade method to verify that your new car can exist in a polymorphic array. Add a subclass constructor that takes a String argument and make sure you have no errors.

//Challenge.
//In the birds package, create an Ornithologist class. The ornithologist should have a changeBirdName method that takes a String newBirdName and a Bird birdToRename as its parameters. It should allow the ornithologist to change the bird's name and announce that it has changed the name from the old name to the new name. Create an OrnithologyConference class. Instantiate an ornithologist and a new bird and have the ornithologist announce the name change on the new bird.

//Challenge.
//In the birds package, create an Ornithologist class. The ornithologist should have a changeBirdName method that takes a String newBirdName and a Bird birdToRename as its parameters. It should allow the ornithologist to change the bird's name and announce that it has changed the name from the old name to the new name. Create an OrnithologyConference class. Instantiate an ornithologist and a new bird and have the ornithologist announce the name change on the new bird.

public class VehicleTest {
    public static void main(String[] args) {
        Airship airship1 = new Airship("Hilda Garde III");
        System.out.println(airship1.getName());
        airship1.setName("Hilda Garde III REMIX");
        System.out.println(airship1.getName());
        airship1.makeNoise();
        airship1.breakingDownNoise();

        Submarine submarine1 = new Submarine("Shinra Sub");
        submarine1.makeNoise();
    }
}
