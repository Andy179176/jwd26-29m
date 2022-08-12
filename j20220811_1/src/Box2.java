public class Box2 <T> {
        private T value;


    public Box2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "value=" + value + " (" + this.value.getClass().getName() +")";
    }

    public static void main(String[] args) {
        Box2<String> b1 = new Box2<>("String text");
        Box2<Integer> b2 = new Box2<>(2);
        Box2<Box2> b3 = new Box2<>(b2);


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }


}
