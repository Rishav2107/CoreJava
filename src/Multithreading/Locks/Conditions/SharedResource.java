package Multithreading.Locks.Conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();
    public void producer(){
        reentrantLock.lock();
        System.out.println("Prod Acquiring lock");
        if(isAvailable){
            try {
                System.out.println("Prod waiting...");
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isAvailable = true;
        condition.signal();
        reentrantLock.unlock();
        System.out.println("Prod Releasing lock");
    }

    public void consumer(){
        reentrantLock.lock();
        System.out.println("Cons Acquiring lock");
        if(!isAvailable){
            try {
                System.out.println("Cons waiting...");
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        condition.signal();
        reentrantLock.unlock();
        System.out.println("Cons Releasing lock");
    }
}
