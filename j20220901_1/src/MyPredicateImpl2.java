public class MyPredicateImpl2 implements MyPredicate{
    @Override
    public boolean test(String s) {
        return s.startsWith("A");
    }
}
