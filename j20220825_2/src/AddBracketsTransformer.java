public class AddBracketsTransformer implements StringTransformer{
    @Override
    public String transform(String str) {
        return "["+str+"]";
    }
}
