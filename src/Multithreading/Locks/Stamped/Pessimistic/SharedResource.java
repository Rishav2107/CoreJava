package Multithreading.Locks.Stamped.Pessimistic;

import java.util.concurrent.locks.StampedLock;
//behaves same as ReadWrite Lock
public class SharedResource {
    public void produce(StampedLock stampedLock){
        long timestamp = stampedLock.writeLock();
        try {
            //update something
            System.out.println("Write Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        } finally {
            System.out.println("Write Lock released by "+Thread.currentThread().getName());
            stampedLock.unlockWrite(timestamp);
        }
    }
    public void consume(StampedLock stampedLock){
        long timestamp = stampedLock.readLock();
        try {
            System.out.println("Read Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        } finally {
            System.out.println("Read Lock released by "+Thread.currentThread().getName());
            stampedLock.unlockRead(timestamp);
        }
    }
}
