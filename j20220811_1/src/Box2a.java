public class Box2a<T extends Number> {
        private T value;


    public Box2a(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public double getDouble(){
        return value.doubleValue();
    }

    public boolean isEquals(Box2a<? extends Integer> obj){
        return value.doubleValue()==obj.getDouble();
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
        //Box2a<String> b1 = new Box2a<>("String text");
        Box2a<Integer> b2 = new Box2a<>(2);
        Box2a<Double> b1 = new Box2a<>(2.0);
        b1.isEquals(b2);
        //Box2a<Box2a> b3 = new Box2a<>(b2);


        //System.out.println(b1);
        System.out.println(b2);
        //System.out.println(b3);
    }


}
