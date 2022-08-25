public class ToUpperCaseTransformer implements StringTransformer{

    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}
