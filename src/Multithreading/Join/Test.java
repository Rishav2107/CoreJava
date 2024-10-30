package Multithreading.Join;

public class Test {
    synchronized void display(){
        System.out.println("Lock acquired");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           //handle exception
        }
        System.out.println("Lock Released");
    }
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Test obj = new Test();
        Thread t = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            obj.display();
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread finished");
    }
}
