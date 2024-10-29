package GenericClasses;

import java.util.ArrayList;
import java.util.List;

//wildcard vs generic
public class Print2 {

    //wildcard
    void computeList(List<? extends Number> source , List<? extends Number> destination){

    }
    //generic
     <T extends Number> void computeList2(List<T> source , List<T> destination){

    }

    //second method workaround
    <T extends Number,K extends Number> void computeList3(List<T> source , List<K> destination){

    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        Print2 obj = new Print2();
        obj.computeList(integerList,doubleList);
        //obj.computeList2(integerList,doubleList);
        obj.computeList2(integerList,integerList);
        obj.computeList3(integerList,doubleList);
    }
}
