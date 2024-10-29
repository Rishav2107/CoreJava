package Collection.Dequeue;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(10);
        arrayDequeAsQueue.addLast(7);

        int ele = arrayDequeAsQueue.removeFirst();
        System.out.println(ele);

        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(10);
        arrayDequeAsStack.addFirst(7);
        int res = arrayDequeAsStack.removeFirst();
        System.out.println(res);

    }
}
