package CollectionFramework.GenericMethod.Iterator_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// wap to print the largest String and smallest String
public class Q4_Iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abcd");
        c.add("Xyzpgq");
        c.add('@');
        c.add("abc");
        c.add("i");
        c.add(100);
        System.out.println("All elements : " + c);

        Iterator itr = c.iterator();
        String largestStr = "";
        String smallestStr = "";
        boolean firstString = true;
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj instanceof String) {
                if (firstString) {
                    smallestStr = largestStr = (String) obj;
                    System.out.println(smallestStr + " " + largestStr);
                    firstString = false;
                }
                if (largestStr.length() < ((String) obj).length()) {
                    largestStr = (String) obj;
                }
                if (smallestStr.length() > ((String) obj).length()) {
                    smallestStr = (String) obj;
                }
            }
        }

        System.out.println(smallestStr);
        System.out.println(largestStr);

    }
}
