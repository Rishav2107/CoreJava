package Singleton;

public class EagerIniatlization {
    private static EagerIniatlization DBConnection = new EagerIniatlization();
    private EagerIniatlization(){

    }
    public static EagerIniatlization getInstance(){
        return DBConnection;
    }

    public void print(){
        System.out.println("EagerIniatlization");
    }

}

