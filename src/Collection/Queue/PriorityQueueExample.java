package Collection.Queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> minPQ = new PriorityQueue<>((Integer val1,Integer val2) -> val2-val1);

        // Adding elements to the PriorityQueue
        minPQ.add(2);
        minPQ.add(12);
        minPQ.add(5);
        minPQ.add(3);
//        for(int values :  minPQ){
//            System.out.println(values);
//        }

        System.out.println("head of PQ : "+minPQ.element());
        while(!minPQ.isEmpty()){
            System.out.println(minPQ.poll());
        }
        System.out.println("***************");
        Integer a[] = {6,4,1,2,9,11};
        Arrays.sort(a,(Integer val1,Integer val2) -> val1-val2 );
        for(int v:a){
            System.out.println(v);
        }
        Arrays.sort(a);
    }

}
