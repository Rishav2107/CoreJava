package Singleton;

public class BillPughSolution {
    private static class NestedClass{
        private static BillPughSolution DBConnection = new BillPughSolution();
    }
    private BillPughSolution(){

    }
    public static BillPughSolution getInstance(){
        return NestedClass.DBConnection;
    }

    public void print(){
        System.out.println("BillPughSolution");
    }
}
