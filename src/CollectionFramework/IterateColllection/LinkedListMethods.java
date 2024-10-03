package CollectionFramework.GenericMethod.IterateColllection;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
//        Queue<Integer> list = new LinkedList<>();
//        Deque<Integer> list = new LinkedList<>();
        // using as list
        list.add(10);
        list.add(20);
        list.add(0,5);
        System.out.println(list);

        list.addFirst(0);
        list.addLast(50);
        System.out.println(list);

        System.out.println(list.peek());

        list.offer(100);
        System.out.println(list);

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);


        //

    }
}
