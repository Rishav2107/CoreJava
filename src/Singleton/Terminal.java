package Singleton;

public class Terminal {
    public static void main(String[] args) {
        EagerIniatlization DBConnectionObject = EagerIniatlization.getInstance();
        DBConnectionObject.print();
        LazyIniatlization DBConnectionObject2 = LazyIniatlization.getInstance();
        DBConnectionObject2.print();
        Sync DBConnectionObject3 = Sync.getInstance();
        DBConnectionObject3.print();

        BillPughSolution DBConnectionObject4 = BillPughSolution.getInstance();
        DBConnectionObject4.print();
    }
}
