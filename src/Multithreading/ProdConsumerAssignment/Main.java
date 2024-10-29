package Multithreading.ProdConsumerAssignment;

public class Main {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();
        Producer producer = new Producer(sharedResources);
        Consumer consumer = new Consumer(sharedResources);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
