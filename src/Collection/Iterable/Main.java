package Collection.Iterable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        //There are three ways to iterate over collection
        //1. using iterator()
        Iterator<Integer> value = values.iterator();
        while(value.hasNext()){
            int v = value.next();
            System.out.println(v);
        }

        //2. Enhanced for loop
        for(int v :  values){
            System.out.println(v);
        }

        //3. forEach()
       // values.forEach();

        int n = Collections.max(values);
        System.out.println("max value is " + n);

        System.out.println(Collections.binarySearch(values,2));

        try {
            Queue<Integer> q = new ArrayDeque<>();
            q.add(1);
            q.add(null);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Successfully executed");
        }
    }
}
