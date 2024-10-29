package Multithreading.Lock;

public class Test{
    public synchronized void task1() {
        System.out.println("inside task1");
        try{
        Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void task2(){
        System.out.println("inside task2 before synchronized");
        synchronized (this){
            System.out.println("inside task2 after synchronized");
        }
    }

    public void task3(){
        System.out.println("inside task3");
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread1 = new Thread(() -> {test.task1();});
        Thread thread2 = new Thread(() -> {test.task2();});
        Thread thread3 = new Thread(() -> {test.task3();});
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
