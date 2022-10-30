public class Demo1 extends Thread {
    @Override
    public void run(){

        for (int i = 0; i < 150; i++) {
            System.out.println(this.getId() + " " + this.getName() + "  " + i);
        }
    }
}
