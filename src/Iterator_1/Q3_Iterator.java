package Iterator_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q3_Iterator {
    // Wa java program to create a collection and give sum of all Integer
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(21);
        c.add(32.4);
        c.add('@');
        c.add(83);
        c.add("abc");
        c.add(100);
        System.out.println("All elements : " + c);
        int sum = 0;
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj instanceof Integer) {
                sum = sum + (Integer) obj; // Object can not be directly added to int so we need to typeCast it either Integer or int
//                sum = sum + (int) obj; // also correct

            }
        }

        System.out.println(sum);
    }
}
