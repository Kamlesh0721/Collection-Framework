package Synchronization.Assignment;

public class User1 extends Thread {
    IRCTC t;
    User1(){

    }
    User1(IRCTC t) {
        this.t = t;
    }


    public void run() {
        t.bookTicket();
    }
}
