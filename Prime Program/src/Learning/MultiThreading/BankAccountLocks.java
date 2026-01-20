package Learning.MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLocks {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+ " trying to withdraw amount..Available balance is:- "+balance);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+ " proceeding to withdraw amount..Available balance is:- "+balance);
                        Thread.sleep(3000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+ " Amount withdrawn successfully..Available balance is:- "+balance);
                    } catch (Exception e) {
                        System.out.println(Thread.currentThread().getName()+ " some error occurred..");
                        Thread.currentThread().interrupt();  // To restore the interrupt state which could be lost if not handled properly
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+ " insufficient funds..");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName()+" could not be acquire lock, will try again later.....");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // To restore the interrupt state which could be lost if not handled properly
        }
    }
}
