package Multithreading.Locks.Reenterant;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    ReentrantLock reentrantLock;
    public SharedResource(ReentrantLock reentrantLock){
        this.reentrantLock = reentrantLock;
    }

    //We see two different thread calls this produce method but still we are able
    //to provide a lock
    public void produce(){
        try {
            reentrantLock.lock();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
        } finally {
            reentrantLock.unlock();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
}
