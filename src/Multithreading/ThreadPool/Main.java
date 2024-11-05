package Multithreading.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        for(int i=0;i<7;i++){
            threadPoolExecutor.submit(()->{
                try{
                    Thread.sleep(5000);
                } catch (Exception e) {
                    //
                }
                System.out.println( "task processed by : " + Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();

    }
}
