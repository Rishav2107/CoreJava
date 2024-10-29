package Multithreading.ProdConsumerAssignment;

public class SharedResources {
    int[] arr = new int[16];
    static int count = 0;
    synchronized void addItem(int x){
        try{
            while(count == arr.length-1){
                System.out.println("queue is full : Producer thread is in pending");
                wait();
            }
            arr[count++]=x;
            System.out.println("Producer added "+x+" to the queue");
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    synchronized int consumeItem(){
        try{
            while(count == 0){
                System.out.println("queue is empty : Consumer thread is in pending");
                wait();
            }
            count--;
            System.out.println("Consumer consumed "+ arr[count] + "  from queue");
            notifyAll();
            return arr[count];
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
