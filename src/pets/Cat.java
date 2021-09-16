package pets;

public class Cat extends Pet {

    public void responseToCommand(String command) {
        System.out.println("You say: " + command);
        System.out.println("Meow... " + this.name + " coughs up feathers...");
    }

}