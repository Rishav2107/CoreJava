package Interfaces;
//All methods and variable are public only
public interface Animal {
    int id=10;

    public static final int x=15;

    void fly();

    public void eat();


    //default method in Java8 feature
    default int getHeight(){
        return 100;
    }

    static boolean canJump(){
        return true;
    }
}
