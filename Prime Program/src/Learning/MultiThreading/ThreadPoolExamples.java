package Learning.MultiThreading;

public class ThreadPoolExamples {

    public static long factorial(int num){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long  result = 1;
        for (int i = 1; i < num; i++) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i-1] = new Thread( ()->
            {   long result = factorial(finalI);
                System.out.println(result);
            });
            threads[i-1].start();
        }
        for (int i = 1; i < 10; i++) {
            try {
                threads[i-1].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total time taken:-- "+(System.currentTimeMillis()-startTime));
    }
}
