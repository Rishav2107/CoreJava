package Multithreading.Locks.ReadWrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock =  new ReentrantReadWriteLock();
        SharedResource sharedResource = new SharedResource();
        Thread t1 =  new Thread(() -> {
            sharedResource.consume(readWriteLock);
        });
        Thread t2 =  new Thread(() -> {
            sharedResource.consume(readWriteLock);
        });
        Thread t3 =  new Thread(() -> {
            sharedResource.produce(readWriteLock);
        });
        Thread t4 =  new Thread(() -> {
            sharedResource.consume(readWriteLock);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
