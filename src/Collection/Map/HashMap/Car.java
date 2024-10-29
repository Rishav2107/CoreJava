package Collection.Map.HashMap;

public class Car<T> implements Vehicle.LightVehicle<T>{

    T key;
    T value;
    Car<T> next;
    Car(T key,T value,Car<T> next){
        this.key=key;
        this.value=value;
        this.next= next;
    }

    @Override
    public void getType() {
        System.out.println("Car is a light vehicle");
        System.out.println("key : value "+key+":"+value);
    }
}
