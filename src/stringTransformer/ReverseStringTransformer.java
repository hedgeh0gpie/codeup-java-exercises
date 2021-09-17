package stringTransformer;

public class ReverseStringTransformer extends StringTransformer {


    public ReverseStringTransformer(String str) {
        super(str);
        this.str = str;
    }

    @Override
    public String transform() {
        return new StringBuffer(str).reverse().toString();

    }
}
