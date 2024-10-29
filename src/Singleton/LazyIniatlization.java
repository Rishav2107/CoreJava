package Singleton;

public class LazyIniatlization {
    private static LazyIniatlization DBConnection;
    private LazyIniatlization(){

    }
    public static LazyIniatlization getInstance(){
        if(DBConnection==null){
            DBConnection = new LazyIniatlization();
        }
        return DBConnection;
    }

    public void print(){
        System.out.println("Lazy Inialization");
    }

}

