public class MyMathMethodsTest {
    public static void main(String[] args) {

        System.out.println(MyMathMethods.multiply(2, 3));
        System.out.println(MyMathMethods.multiply(2.5, 2));

        System.out.println(MyMathMethods.quotient(10, 5));
        System.out.println(MyMathMethods.quotient(8.0, 2.5));

        int[] intArray1 = {1, 2, 3, 4, 5};
        int[] intArray2 = {6, 7, 8, 9, 10};
        double[] doubleArray1 = {1, 2, 3, 4, 5};
        double[] doubleArray2 = {6, 7, 8, 9, 10};
        System.out.println(MyMathMethods.sum(intArray1, intArray2));
        System.out.println(MyMathMethods.sum(doubleArray1, doubleArray2));

    }
}
