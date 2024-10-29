package Collection.Map.LinkedHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main<T,U> { //implements BiConsumer<T, U> {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "A");
        linkedHashMap.put(21, "B");
        linkedHashMap.put(23, "C");
        linkedHashMap.put(141, "D");
        linkedHashMap.put(25, "E");
        System.out.println("Linked HashMap");
//       for(Collection.Map.Entry<Integer,String> entry : linkedHashMap.entrySet()){
//           System.out.println(entry.getKey()+" "+entry.getValue());
//       }
        linkedHashMap.forEach((Integer K, String V) -> {
            System.out.println(K + " " + V);
        });


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");
        System.out.println("Normal HashMap");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//    @Override
//    public void accept(T t, U u) {
//        System.out.println("foreach : " + t + " " + u);
//    }

        //access order is true
        LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>(16, .75F, true);
        linkedHashMap2.put(1, "A");
        linkedHashMap2.put(21, "B");
        linkedHashMap2.put(23, "C");
        linkedHashMap2.put(141, "D");
        linkedHashMap2.put(25, "E");
        linkedHashMap2.get(23);
        System.out.println("Linked HashMap with access order true");
        linkedHashMap2.forEach((Integer K, String V) -> {
            System.out.println(K + " " + V);
        });

        /* making thread safe manually because there is no thread safe version available */
       Map<String,Integer> lmap =  Collections.synchronizedMap(new LinkedHashMap<>());
       lmap.put("A",1);
    }
}
