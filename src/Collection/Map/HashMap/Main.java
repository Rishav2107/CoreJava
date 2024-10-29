package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Ashish");
        hashMap.put(2,"Rishav");
        hashMap.put(3,"Aniket");
        hashMap.put(4,null);

        System.out.println("size "+hashMap.size());
        hashMap.putIfAbsent(4,"Nityam");

        for(Map.Entry<Integer,String> entryMap: hashMap.entrySet()){
            System.out.println("Key : "+entryMap.getKey()+" value : "+entryMap.getValue());
        }

        String name  = hashMap.get(2);
        System.out.println("value " + name);

        for(Integer x : hashMap.keySet()){
            System.out.println(x);
        }

        for(String v : hashMap.values()){
            System.out.println(v);
        }
        System.out.println("for each");
        hashMap.forEach((Integer K , String V) -> {
            System.out.println(K + " " + V);
        });
        Car<String> car = new Car<>("BMW","Sports Car",null);
        car.getType();

        Integer n=1;
        System.out.println(n.hashCode());
    }
}
