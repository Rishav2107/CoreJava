package Multithreading.Locks.Stamped.Pessimistic;

import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        StampedLock stampedLock =  new StampedLock();
        SharedResource sharedResource = new SharedResource();
        Thread t1 =  new Thread(() -> {
            sharedResource.consume(stampedLock);
        });
        Thread t2 =  new Thread(() -> {
            sharedResource.consume(stampedLock);
        });
        Thread t3 =  new Thread(() -> {
            sharedResource.produce(stampedLock);
        });
        Thread t4 =  new Thread(() -> {
            sharedResource.consume(stampedLock);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
