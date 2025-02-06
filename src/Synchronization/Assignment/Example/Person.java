package Synchronization.Assignment.Example;


public class Person extends Thread {
    String name;
    BankAccount account;
    int amount;

    Person(BankAccount account,String name,int amount){
        this.account=account;
        this.name=name;
        this.amount=amount;
    }
    @Override
    public void run(){
        try {
            account.withdraw(this.name, amount);
        }catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }

    }
}
