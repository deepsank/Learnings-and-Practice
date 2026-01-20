package Learning.MultiThreading;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount){
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+ " trying to withdraw amount..Available balance is:- "+balance);
            try {
                Thread.sleep(3000);
                balance-=amount;
                System.out.println(Thread.currentThread().getName()+ " Amount withdrawn successfully..Available balance is:- "+balance);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+ " some error occurred..");
            }
        }
        else{
            System.out.println(Thread.currentThread().getName()+ " insufficient funds..");
        }
    }
}
