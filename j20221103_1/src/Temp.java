public class Temp {


    public static void qwe(){
        System.out.println(Thread.currentThread().getId()+ " qwe-qwe");
    }
    public static void qwa(){
        System.out.println(Thread.currentThread().getId()+ " qwa-qwa");
    }

    public void qwu(){
        System.out.println(Thread.currentThread().getId()+ " qwu-qwu");
    }
    public void createAndStartThreads(){
        new Thread(  this::qwu     ).start();
    }


    public static void main(String[] args) {
          Thread t1 = new Thread(  ()-> Temp.qwe()      );
          Thread t2 = new Thread(  Temp::qwe     );
          Thread t3 = new Thread(  ()-> Temp.qwa()      );
          Thread t4 = new Thread(  Temp::qwa     );
         t1.start();
          t2.start();
          t3.start();
          t4.start();

          Temp temp = new Temp();
          new Thread(  temp::qwu     ).start();

          temp.createAndStartThreads();


    }


}
