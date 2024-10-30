package Multithreading.Locks.ReadWrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    public void produce(ReadWriteLock readWriteLock){
        try {
            readWriteLock.writeLock().lock();
            //update something
            System.out.println("Write Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        } finally {
            System.out.println("Write Lock released by "+Thread.currentThread().getName());
            readWriteLock.writeLock().unlock();

        }
    }
    public void consume(ReadWriteLock readWriteLock){
        try {
            readWriteLock.readLock().lock();
            System.out.println("Read Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        } finally {
            System.out.println("Read Lock released by "+Thread.currentThread().getName());
            readWriteLock.readLock().unlock();

        }
    }
}
