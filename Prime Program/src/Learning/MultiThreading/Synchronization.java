package Learning.MultiThreading;

public class Synchronization extends Thread{
    private Counter counter;
    public Synchronization(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }


    public static void main(String[] args) {
        Counter counter = new Counter();
        Synchronization t1 = new Synchronization(counter);
        Synchronization t2 = new Synchronization(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
        

    }
}
