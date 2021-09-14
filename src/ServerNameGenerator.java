//TODO: Server Name Generator
//
//We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//
//Example Output
//
//Here is your server name:
//dedicated-photon

import java.util.Random;

public class ServerNameGenerator {

static String[] adjectives = {"mystic", "rare", "arcane", "magical", "retro", "ancient", "progressive", "flaming", "frozen", "fabulous"};
static String[] nouns = {"glacier", "dog", "cat", "pixel-art", "technique", "guitar", "coffee", "lava-lamp", "chanclas", "book-of-secrets"};




public static String randomElement(String[] array) {
    Random rand = new Random();
    int upperbound = array.length;
    int int_random = rand.nextInt(upperbound);

    return array[int_random];


}

    public static void main(String[] args) {

        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }





}
