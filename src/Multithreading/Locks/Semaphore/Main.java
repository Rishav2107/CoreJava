package Multithreading.Locks.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        SharedResource sharedResource1 = new SharedResource(semaphore);
        Thread t1 =  new Thread(() -> {
            sharedResource1.produce();
        });
        SharedResource sharedResource2 = new SharedResource(semaphore);
        Thread t2 =  new Thread(() -> {
            sharedResource2.produce();
        });
        Thread t3 =  new Thread(() -> {
            sharedResource2.produce();
        });
        Thread t4 =  new Thread(() -> {
            sharedResource2.produce();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
