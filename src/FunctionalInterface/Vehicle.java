package FunctionalInterface;

@FunctionalInterface
public interface Vehicle {
    void playHorn(String value);
    default int getWheels(){
        return 4;
    }
    static void getColor(){
        System.out.println("Black");
    }
    String toString(); //Object Class method
}
