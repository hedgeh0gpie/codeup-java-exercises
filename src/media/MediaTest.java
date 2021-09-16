package media;

public class MediaTest {

    public static void main(String[] args) {
        Record record1 = new Record();
        Microfiche microfiche1 = new Microfiche();

        record1.checkoutMediaFromLibrary();
        System.out.println(record1.consumeMedia());

        microfiche1.checkoutMediaFromLibrary();
        System.out.println(microfiche1.consumeMedia());
    }
}
