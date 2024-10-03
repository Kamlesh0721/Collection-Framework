package CollectionFramework.GenericMethod.IterateColllection;

import java.util.*;

public class MapRevision {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        hm.put(1, 10);
        hm.put(2, 20);
        hm.put(null, 30);
        hm.put(null,50);


//        Iterator<Integer> it = hm.keySet().iterator();
//        while(it.hasNext()){
//            Object key=it.next(); // int can not store null
//            int value=hm.get(key);
//            System.out.println("Key :"+key+" "+"Value : "+value);
//        }

//        System.out.println(hm.get(5));

//        Iterator<Entry<Integer, Integer>> it = hm.entrySet().iterator();
//        while (it.hasNext()) {
//            Entry<Integer, Integer> entry = it.next();
//            System.out.println(entry);
////            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        Iterator<Integer> it=hm.keySet().iterator();


    }
}
