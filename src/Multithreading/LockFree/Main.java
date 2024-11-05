package Multithreading.LockFree;

import Multithreading.LockFree.*;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(()->{
            for(int i=0;i<200;i++){
                sharedResource.increment();
            }
        });


        Thread t2 = new Thread(()->{
            for(int i=0;i<200;i++){
                sharedResource.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        AtomicInteger res = sharedResource.get();
        System.out.println(res);
    }
}
