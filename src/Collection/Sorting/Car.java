package Collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Custom Object Comparator
public class Car {
    String name;

    Car(){
        this("default");
    }

    Car (String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Car carObj1 = new Car("Honda");
        Car carObj2 = new Car("Bmw");
        Car carObj3 = new Car("Audi");
        List<Car> carList = new ArrayList<>();
        carList.add(carObj1);
        carList.add(carObj2);
        carList.add(carObj3);
        Comparator<? super Car> carComparator = new CarNameComparator();
        Collections.sort(carList,carComparator);
        for(Car car : carList)
            System.out.println(car.name);

    }
}
