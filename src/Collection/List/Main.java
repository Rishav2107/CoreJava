package Collection.List;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main implements UnaryOperator<Integer> {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,50);
        arrayList.add(1,20);
        arrayList.add(2,30);
        arrayList.add(3,40);
        arrayList.replaceAll(new Main());

        new ArrayList<Integer>(arrayList);

        for(int v : arrayList){
            System.out.println(v);
        }
        System.out.println("After Sorting");
        //Collections.sort(arrayList);
        arrayList.sort((Integer val1,Integer val2)-> val1-val2);
        for(int v : arrayList){
            System.out.println(v);
        }
        System.out.println("Set -4000 at index 2");
        arrayList.set(2,-4000);
        for(int v : arrayList){
            System.out.println(v);
        }
        arrayList.remove(2);
        System.out.println("Remove index 2");
        for(int v : arrayList) {
            System.out.println(v);
        }
        arrayList.listIterator();
        //LinkedList supports both index based operation from List
        // and deque related operations
        System.out.println("Linkedlist");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,100);
        linkedList.add(1,300);
        linkedList.add(2,400);
        for(int v : linkedList){
            System.out.println(v);
        }
        linkedList.add(1,200);
        System.out.println("After adding");
        for(int v : linkedList){
            System.out.println(v);
        }
        int x = linkedList.getFirst();
        System.out.println("x "+x);
        int y = linkedList.get(2);
        System.out.println("y "+y);

        linkedList.addFirst(50);
        System.out.println("Add first called");
        for(int v : linkedList) {
            System.out.println(v);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        //Strings are immutable
        String s1="hello";
        String s2="hello";
        String s3 = new String("hey");
        String s4 = new String("hey");
        if(s1 == s2)
            System.out.println("Equal");
    }

    @Override
    public Integer apply(Integer integer) {
        return integer * -1;
    }


}
