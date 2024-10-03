package CollectionFramework.GenericMethod;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<Animal> l = new ArrayList<>();
        l.add(new Animal());
        l.add(new Animal());

        Test.store(l);

        List<Cat> l2 = new ArrayList<>();
        l2.add(new Cat());
        l2.add(new Cat());

        Test.store(l2);
}}
