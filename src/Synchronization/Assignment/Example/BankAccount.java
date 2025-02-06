package Synchronization.Assignment.Example;

public class BankAccount {
    private int balance;

    BankAccount(int amount) {
        this.balance = amount;
    }
    synchronized  public void addMoney(String threadName,int depositAmt){
        System.out.println(threadName + " is trying to deposit");

        System.out.println(threadName + " deposit process started");

        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.getMessage();
        }

        balance+=depositAmt;
        System.out.println(threadName+ " has deposited "+ depositAmt);
    }
    synchronized public void withdraw(String threadName, int withdrawAmt) throws InsufficientBalance{
        System.out.println(threadName + " is trying to withdraw");
        if (withdrawAmt <= balance) {
            System.out.println(threadName + " withdraw started");
            try {
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.getMessage();
            }
            balance -= withdrawAmt;
            System.out.println(threadName + " withdraw successful");
        } else {
            throw new InsufficientBalance("Insuffient Balance");
        }

    }

}
