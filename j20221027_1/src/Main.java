public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        String str1=Integer.toBinaryString(Integer.MIN_VALUE);
        String str2=Integer.toBinaryString(Integer.MIN_VALUE-1);
        System.out.println(str1 + "("+str1.length()+" bit)" + Integer.MIN_VALUE);
        System.out.println("0"+str2 + "("+str2.length()+" bit)"+ (Integer.MIN_VALUE-1));
         */
        final int limit =500;
        System.out.println("start");
        Runnable r1 = () -> {
            for (int i=0; i<limit; i++){
                System.err.print(" " + i);
            }
            System.out.println();
        };

        Runnable r2 = () -> {
            //new Thread(()-> System.out.println("JACK")).start();
            for (int i=0; i<limit; i++){
                System.err.print("a" );
            }

            System.out.println();
        };


        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        //t.setDaemon(true);
        Thread[] threads={t1,t2};
        for (Thread t:threads){
            t.start();
        };
        /*
        for (Thread t:threads){
            t.join();
        };*/
        t1.join();
        t2.join();


/*
        for (int i=0; i<2000;i++){
            System.out.println(i+ "  main");
        }

 */


        System.out.println("finish");
    }
}