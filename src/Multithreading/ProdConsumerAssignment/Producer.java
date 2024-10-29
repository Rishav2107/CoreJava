package Multithreading.ProdConsumerAssignment;

public class Producer implements Runnable{
    SharedResources sharedResources;
    public Producer(SharedResources sharedResources){
        this.sharedResources = sharedResources;
    }
    @Override
    public void run() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        while(true){
        this.sharedResources.addItem(randomNumber);
        }
    }
}
