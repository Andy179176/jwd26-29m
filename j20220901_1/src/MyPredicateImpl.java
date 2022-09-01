public class MyPredicateImpl implements MyPredicate{
    @Override
    public boolean test(String s) {
        return s.length()>3;
    }
}
