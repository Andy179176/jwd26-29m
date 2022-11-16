
    public class Main5 {
        public static long counter=0;
        public static void main(String[] args) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int i=0;
                    counter=0;
                    while (i<= 1_000_000){
                        counter+=i;
                        i++;
                        if (counter%10_000==0) System.out.println(counter);
                    }

                }
            });

            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Done! " +counter);

        }
    }
