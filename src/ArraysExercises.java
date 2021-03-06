import java.util.Arrays;

//TODO: Array Basics
//Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
//What happens when you run the following code? Why is Arrays.toString necessary?
// int[] numbers = {1, 2, 3, 4, 5};
// System.out.println(numbers);
//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
// Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


public class ArraysExercises {

    public static Person[] people = {
            new Person("Pollito"),
            new Person("Yayi"),
            new Person("Abuelita")
    };

    public static Person person1 = new Person("Panchito");


    public static Person[] addPerson(Person[] people, Person person) {
        Person[] fourPeople = Arrays.copyOf(people, people.length + 1);
        fourPeople[people.length] = person;
        return fourPeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        for (Person person : addPerson(people, person1)) {
            System.out.println(person.getName());
        }



    }
}
