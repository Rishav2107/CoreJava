package Collection.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,100);
        arrayList.add(1,130);
        arrayList.add(2,140);
        arrayList.add(3,170);

        long output = arrayList.stream().filter((Integer val)-> val>135).count();
        System.out.println("Total country with population greater than 135 is "+output);

       Stream<String> nameStream = Stream.of("Hello","everyone","HEY","HOW","ARE");
       Stream<String> filteredStream = nameStream.filter((String values)-> values.length()<=3);
        Stream<String> filteredStreamLowerCase =  filteredStream.map((String v)-> v.toLowerCase());
       List<String> filteredNameList = filteredStreamLowerCase.collect(Collectors.toList());
       filteredNameList.forEach((String s)-> {
           System.out.println(s);
       });

       Integer[] arr ={1,2,3,4,5};
       List<Integer> res  = Arrays.stream(arr).sorted((Integer v1, Integer v2)->v2-v1).collect(Collectors.toList());
       res.forEach((Integer s)-> {
            System.out.println(s);
        });

        System.out.println("*********");
       int a[] = {1,2,3,4,5};
       IntStream intStream = Arrays.stream(a);
       int [] ans = intStream.filter((int value) -> value>2).toArray();
       for(int x : ans)
           System.out.println(x);

    }
}
