package Collection.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(15);
        hashSet.add(10);
        hashSet.add(12);
        hashSet.add(7);
        hashSet.forEach((Integer value) -> {
            System.out.println(value);
        });
        System.out.println("**********");
        HashSet<Integer> anotherHashSet = new HashSet<>();
        anotherHashSet.add(100);
        anotherHashSet.add(200);
        anotherHashSet.add(10);
        anotherHashSet.forEach((Integer value) -> {
            System.out.println(value);
        });

//        System.out.println("set a + set b");
//        hashSet.addAll(anotherHashSet);
//        hashSet.forEach((Integer value) -> {
//            System.out.println(value);
//        });
//
//        System.out.println("set a - set b");
//        hashSet.removeAll(anotherHashSet);
//        hashSet.forEach((Integer value) -> {
//            System.out.println(value);
//        });

        System.out.println("set a intersection set b");
        hashSet.retainAll(anotherHashSet);
        hashSet.forEach((Integer value) -> {
            System.out.println(value);
        });
        System.out.println("Tree Set");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(7);
        treeSet.forEach((Integer value) -> {
            System.out.println(value);
        });

    }
}
