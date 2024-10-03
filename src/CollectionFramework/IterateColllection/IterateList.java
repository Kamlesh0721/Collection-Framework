package CollectionFramework.GenericMethod.IterateColllection;

import java.util.*;

public class IterateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // method 1
//        System.out.println(list);

//        method 2
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
        // method 3 // Enhanced for loop
//        for (int num :list){
//            System.out.print(num +" ");
//        }
//        System.out.println();

        ArrayList list2 = new ArrayList(Arrays.asList(1, 2, "Hello", 4, "World", 55.3));

        // print all type of data
//        for(var val:list2){
//            System.out.println(val);
//        }

        // Iterator
//        Iterator it = list2.iterator();
//        while(it.hasNext()){
//
//            System.out.print(it.next()+ " ");
//            list2.add(100);
//        }
//        System.out.println();
        //list iterator
        ListIterator lit=list2.listIterator();
        while (lit.hasNext()){
            System.out.print(lit.next()+" ");
//            list2.add(1000); // give error
        }

        System.out.println(list2);
        // java 8+ feature  : foreach loop
//        list2.forEach(value -> {
//            System.out.println(value);
//        });

//        // java 8+ feature : streams
//        list2.stream().forEach(System.out::println);
    }
}
