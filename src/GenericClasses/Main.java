package GenericClasses;

import java.util.ArrayList;
import java.util.List;
//wildcard
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bike());

        List<Bike> bikeList = new ArrayList<>();
       // bikeList = vehicleList;
       // vehicleList = bikeList;

        List<Object> commonList = new ArrayList<>();

        Display display = new Display();
        display.printListOfVehicles(vehicleList);
        display.printListOfVehicles(bikeList);

        display.printListOfVehicles2(vehicleList);
        //display.printListOfVehicles2(bikeList);
        display.printListOfVehicles2(commonList);
    }
}
