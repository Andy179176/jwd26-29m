public class Box3<T extends Number ,E extends String> {
        private T value1;
        private E value2;

    public Box3(T value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }
    public boolean isEquals(){
        return value1.doubleValue() == Double.parseDouble(value2);
    }
    public boolean value2isNum(){
        try {
            Double.parseDouble(value2);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Box3{" +
                "value1=" + value1 + " (" + this.value1.getClass().getName() +") \n"
                +"value2=" + value2 + " (" + this.value2.getClass().getName() +") \n";
    }

    public static void main(String[] args) {
        Box3<Integer,String> b1 = new Box3<>(10,"20");
        System.out.println(b1.isEquals());
        System.out.println(b1);

    }


}
