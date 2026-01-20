package Learning.MultiThreading;

public class MainExtrinsicLock {

    public static void main(String[] args) {
        BankAccountLocks sbi = new BankAccountLocks();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();


    }
}
