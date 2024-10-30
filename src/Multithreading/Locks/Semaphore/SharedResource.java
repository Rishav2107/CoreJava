package Multithreading.Locks.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    Semaphore semaphore;
    public SharedResource(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    //We see two different thread calls this produce method but still we are able
    //to provide a lock
    public void produce(){
        try {
            semaphore.acquire();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            //
        } finally {
            semaphore.release();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
}
