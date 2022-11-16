public class Main {
    public static void main(String[] args) throws InterruptedException {
       Thread t1= new Thread(new Printer());
       t1.start();
       Thread.sleep(7000);
       while (t1.isAlive()){
           t1.interrupt();
           Thread.sleep(1000);
       }

    }


}
class Printer implements Runnable{
    private  String str ="123456789";
    private int currentChar=0;
    boolean isStop = false;

    @Override
    public void run() {
        while (!isStop) {
            if (Thread.interrupted()) {
                isStop=changeChar();
            }
            System.out.println(str.charAt(currentChar));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(" Opps! Exception but I Change Char");
                isStop=changeChar();
                //Thread.currentThread().interrupt();
            }
        }
    }

    private boolean  changeChar(){
        if (currentChar<str.length()-1){
            currentChar++;
        } else {
            System.out.println();
            currentChar=0;
        }
        if (currentChar==5){
            return  true;
        } else {
            return false;
        }
    }





}



