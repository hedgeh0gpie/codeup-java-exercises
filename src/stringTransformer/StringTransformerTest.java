package stringTransformer;

public class StringTransformerTest {
    public static void main(String[] args) {
        UpperCaseStringTransformer str1 = new UpperCaseStringTransformer("test");
        ReverseStringTransformer str2 = new ReverseStringTransformer("test");

        StringTransformer[] stringArr = {str1, str2};
        for (StringTransformer str : stringArr) {
            System.out.println(str.transform());
        }


    }
}
