package Multithreading.Locks.Reenterant;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        SharedResource sharedResource1 = new SharedResource(reentrantLock);
        Thread t1 =  new Thread(() -> {
            sharedResource1.produce();
        });
        SharedResource sharedResource2 = new SharedResource(reentrantLock);
        Thread t2 =  new Thread(() -> {
            sharedResource2.produce();
        });

        t1.start();
        t2.start();
    }
}
