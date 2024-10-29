package Singleton;

public class Sync {
    private static Sync DBConnection;
    private Sync(){

    }
    synchronized public static Sync getInstance(){
        if(DBConnection==null){
            DBConnection = new Sync();
        }
        return DBConnection;
    }

    public void print(){
        System.out.println("Sync Inialization");
    }
}
