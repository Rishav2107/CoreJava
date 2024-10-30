package Multithreading.Locks.Stamped.Optimistic;

import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        StampedLock stampedLock =  new StampedLock();
        SharedResource sharedResource = new SharedResource();
        Thread t1 =  new Thread(() -> {
            sharedResource.consume(stampedLock);
        });
        Thread t2 =  new Thread(() -> {
            sharedResource.produce(stampedLock);
        });
        t1.start();
        t2.start(); //comment this and check other behaviour
    }
}
