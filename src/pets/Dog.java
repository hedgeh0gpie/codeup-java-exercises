package pets;

public class Dog extends Pet {

    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }

    public void responseToCommand(String command) {
        System.out.println("You say: " + command);
        System.out.println(this.name + " runs up for some lovin'!");
    }

}