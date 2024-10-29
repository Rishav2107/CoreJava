package Vehicle;

public class LuxuryCar extends Car{

    public LuxuryCar(int mileage) {
        super(mileage);
    }

    @Override
    public void pressBreak() {
        System.out.println("Breaks are pressed");
    }

    @Override
    public void pressHorn() {
        System.out.println("Blow Horn");
    }
}
