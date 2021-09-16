//Consider a library.
// In the library, there are various forms of media accessible to the public.
// A patron of a library can access newspapers, books, microfiche, magazines, records, cds, etc.
//Create a media.Media abstract class
//Identify at least one process that can be done the same way for each form of media.
// Add a public void instance method named after this thing and give it a message to print simply print out generally describing this process.
//Identify at least one process that be done for each form of media but requires a unique approach / implementation for each specific sub-type of media.
// Create an abstract method that defines method signature for this process but does not include the method body.
//Extend from media.Media with one of the above listed sub-types of media
//Include an implementation (method body) of the abstract method created in the media.Media class
//BONUS: identify and add another abstract method to the media.Media class and extend the media.Media class in additional sub-types

package media;

abstract class Media {

    public void checkoutMediaFromLibrary() {
        System.out.println("You hand the librarian your library card");
    }

    public abstract String consumeMedia();
}
