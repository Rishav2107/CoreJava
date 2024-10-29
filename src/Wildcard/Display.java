package Wildcard;

import java.util.List;

public class Display {

    //wildcard - upper bound
    public void printObject(List<? extends Vehicles> vehicleList){

    }

    //Generic method - upper bound
    public <T extends Vehicles> void printObject2(List<T> vehicleList){

    }

    // wildcard - unbounded
    public void printObject3(List<?> vehicleList){

    }

    // wildcard - lower bound
    public void printObject4(List<? super Vehicles> vehicleList){

    }
}
