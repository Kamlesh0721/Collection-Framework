package Multithreading;

class A2 implements Runnable {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B2 implements Runnable {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A2 obj1=new A2();
        B2 obj2=new B2();

        Thread T1=new Thread(obj1);
        T1.start();

        Thread T2=new Thread(obj2);
        T2.start();

//        A2.start();
    }
}
