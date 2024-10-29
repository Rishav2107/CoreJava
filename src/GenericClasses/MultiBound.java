package GenericClasses;

public class MultiBound <T extends Vehicle & Road & Engine> {
    void method(){
        System.out.println("MultiBound Class");
    }

    public static void main(String[] args) {
        MultiBound<Car> carObj = new MultiBound<>();
        carObj.method();

        //error
        //MultiBound<Bike> bikeObj = new MultiBound<>();

    }
}
