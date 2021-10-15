// In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
// Create a public static method, `flipOuterCase`, that takes in a string and returns the string with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipOuterCase(“cat”)); // CaT
//        System.out.println(flipOuterCase(“CaT”)); // cat
//        System.out.println(flipOuterCase(“caT”)); // Cat
//        System.out.println(flipOuterCase(“cAt”)); // CAT

package warmups;

public class JavaDrills {

// Source: https://stackoverflow.com/questions/1729778/how-can-i-invert-the-case-of-a-string-in-java
    public static String flipOuterCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == chars[0] || chars[i] == chars[chars.length - 1]) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(JavaDrills.flipOuterCase("cAt"));
        System.out.println(JavaDrills.flipOuterCase("CaT"));
    }

}
