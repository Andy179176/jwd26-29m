public class Box1 {
        private Object value;

    public Box1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "value=" + value + " (" + this.value.getClass().getName() +")";
    }

    public static void main(String[] args) {
        Box1 b1= new Box1("String");
        Box1 b2= new Box1(Integer.valueOf(100));

        System.out.println(b1);
        System.out.println(b2);

        String s=(String)b1.getValue();
        Integer i=(Integer) b2.getValue();
        System.out.println(i+10);

        Main.add10(b1);

    }


}
