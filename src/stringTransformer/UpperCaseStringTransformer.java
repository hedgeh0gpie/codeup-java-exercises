package stringTransformer;

public class UpperCaseStringTransformer extends StringTransformer {
    public UpperCaseStringTransformer(String str) {
        super(str);
        this.str = str;
    }

    @Override
    public String transform() {
        return str.toUpperCase();
    }
}
