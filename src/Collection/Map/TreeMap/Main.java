package Collection.Map.TreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10,"A");
        treeMap.put(3,"B");
        treeMap.put(17,"C");
        treeMap.put(14,"D");
        treeMap.forEach((Integer K, String V) -> {
            System.out.println(K+" "+V);
        });
        System.out.println("Floor Entry : "+treeMap.floorEntry(10));
        System.out.println("Lower Entry : "+treeMap.lowerEntry(10));
        //methods inherited from SortedMap<<I>>
        //17 14 10 3
        System.out.println(treeMap.headMap(10));
        treeMap.tailMap(14);
        treeMap.firstKey();
        treeMap.lastKey();

    }
}
