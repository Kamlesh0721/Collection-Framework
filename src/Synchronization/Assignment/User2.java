package Synchronization.Assignment;

public class User2 extends Thread {
    IRCTC t;

    User2() {

    }

    User2(IRCTC t) {
        this.t = t;
    }

    public void run() {
        t.bookTicket();
    }
}
