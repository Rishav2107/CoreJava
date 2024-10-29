package Vehicle;

public abstract class Car {
    int mileage;

    public Car(int mileage){
        this.mileage=mileage;
    }
    public abstract void pressBreak();
    public abstract void pressHorn();
    int getWheels(){
        return 4;
    }
}
