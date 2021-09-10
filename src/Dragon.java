//TODO: Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.

//TODO: Modify your animal class so that the name and noise are initiated during object construction, and the animal makes a noise when it is created.

//TODO: Encapsulate your animal class. Use your test class to verify that your instance variables cannot be directly accessed and can only be accessed through your getters and setters.

public class Dragon {
    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }



    public String makeNoise() {
        return name + " goes " + sound;
    }

    public String sayQuote() {
        return Quote.randomQuote();
    }

    public Dragon(String name, String sound){
        System.out.println("A new dragon has emerged!");
        this.name = name;
        this.sound = sound;
    }
}
