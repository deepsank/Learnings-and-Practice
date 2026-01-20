package Learning.MultiThreading;

public class WithThreadClass extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        System.out.println("--------In the main thread-------");
        WithThreadClass t1 = new WithThreadClass();         // NEW state
        t1.start();                                         //RUNNABLE state
        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
