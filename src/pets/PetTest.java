package pets;

public class PetTest {
    public static void main(String[] args) {

        Cat Ryu = new Cat();

        Ryu.name = "Ryu";
        Ryu.age = 7;
        Ryu.weight = 13;
        Ryu.species = "Siamese";

        Ryu.responseToCommand("Stop bringing dead birds into my room!!");
        Ryu.rest(12);

        Dog Lily = new Dog();

        Lily.name = "Lily Pad";
        Lily.age = 9;
        Lily.weight = 4;
        Lily.species = "Chihuahua mix";

        Lily.responseToCommand("Come here for kisses!! *smooch*");
        Lily.rest(9);

    }
}
