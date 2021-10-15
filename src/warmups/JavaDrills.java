// In `codeup-java-exercises`, create a class `JavaDrills`, with the following:
// Create a public static method, `flipOuterCase`, that takes in a string and returns the string with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipOuterCase(“cat”)); // CaT
//        System.out.println(flipOuterCase(“CaT”)); // cat
//        System.out.println(flipOuterCase(“caT”)); // Cat
//        System.out.println(flipOuterCase(“cAt”)); // CAT

package warmups;

import java.util.Arrays;
import java.util.List;

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

//    In `codeup-java-exercises`, in `JavaDrills`:
//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.

//    returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2


    public static int returnTotalDifference(List<Integer> nums1, List<Integer> nums2) {
        int accumulator1 = 0;
        int accumulator2 = 0;

        for (Integer num : nums1) {
            accumulator1 += num;
        }
        for (Integer num : nums2) {
            accumulator2 += num;
        }
        return accumulator1 - accumulator2;
    }

    public static void main(String[] args) {
        System.out.println(JavaDrills.flipOuterCase("cAt"));
        System.out.println(JavaDrills.flipOuterCase("CaT"));

        System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));

    }

}
