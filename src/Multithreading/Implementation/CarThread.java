package Multithreading.Implementation;

public class CarThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread created");
    }
    public void test(){

    }
    public static void main(String[] args) {
       Thread carThread = new CarThread();
       carThread.start();
    }
}
