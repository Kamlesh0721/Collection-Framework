package Iterator_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// WAP to print the smallest integer and largest integer in Collection
public class Q5_Iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add('#');
        c.add(10);
        c.add(12432);
        c.add(1);
        c.add("ab");
        c.add(232.5);
        c.add(829482);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj instanceof Integer) {
                int currInt = (int) obj;
                if(currInt>largest){
                    largest=currInt;
                }
                if(currInt<smallest){
                    smallest=currInt;
                }
            }
        }

        System.out.println("Largest : "+largest);
        System.out.println("Smallest : "+smallest);
    }
}
