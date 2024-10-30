package Multithreading.Locks.Stamped.Optimistic;

import java.util.concurrent.locks.StampedLock;
//behaves same as ReadWrite Lock
public class SharedResource {
    public void produce(StampedLock stampedLock){
        long timestamp = stampedLock.writeLock();
        try {
            //update something
            System.out.println("Write Lock acquired by "+Thread.currentThread().getName());
        }  finally {
            System.out.println("Write Lock released by "+Thread.currentThread().getName());
            stampedLock.unlockWrite(timestamp);
        }
    }
    public void consume(StampedLock stampedLock){
        long timestamp = stampedLock.tryOptimisticRead();
        try {
            System.out.println("Taken Optimistic lock");
            Thread.sleep(5000);
            if(stampedLock.validate(timestamp))
                System.out.println("read successfully");
            else
                System.out.println("rollback");
        } catch (InterruptedException e) {
            //
        }
    }
}
