package Synchronization.Assignment.Example;

public class MainBranch {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        Person p1 = new Person(bankAccount, "Person 1 ", 300);
        Person p2 = new Person(bankAccount, "Person 2", 900);

        p1.start();
        p2.start();
    }
}
