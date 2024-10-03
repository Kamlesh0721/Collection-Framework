package CollectionFramework.GenericMethod.Iterator_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q2_Iterator {
// WA java program to remove all elements from collection except Integer.
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(21);
        c1.add(32.4);
        c1.add('@');
        c1.add(83);
        c1.add("abc");
        c1.add(100);

        System.out.println("All elements : " + c1);

        // Iterate over all elements of arraylist
        Iterator itr = c1.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();  // return current object and move cursor to next object
            if (!(obj instanceof Integer)) {
                itr.remove();
//                c1.remove(obj); // This will give error we can not use it directly
            }
        }

        System.out.println("All elements : " + c1);
    }
}
