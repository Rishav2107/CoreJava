package Multithreading.Implementation;

//using Runnable interface
public class Test implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Test t = new Test();
        Thread thread = new Thread(t);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
