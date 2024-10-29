package Multithreading.ProdConsumerAssignment;

public class Consumer implements Runnable{
    SharedResources sharedResources;
    public Consumer(SharedResources sharedResources){
        this.sharedResources = sharedResources;
    }
    @Override
    public void run() {
        while(true) {
            this.sharedResources.consumeItem();
//            try {
//                Thread.sleep(500); // Optional: add a small delay for clarity in output
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
