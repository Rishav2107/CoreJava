package Multithreading.LockFree;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    AtomicInteger counter = new AtomicInteger(0);
    void increment(){
        //internally it leverages CAS operations
        counter.incrementAndGet();
    }
    AtomicInteger get(){
        return  counter;
    }

}
