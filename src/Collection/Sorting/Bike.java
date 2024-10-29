package Collection.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//Comparable
public class Bike implements Comparable<Bike>{
    String name;
    Bike(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Bike o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(new Bike("Harley"));
        bikeList.add(new Bike("Royal Enfield"));
        bikeList.add(new Bike("Ola"));
        Collections.sort(bikeList);
        for (Bike bike : bikeList){
            System.out.println(bike.name);
        }

    }
}
