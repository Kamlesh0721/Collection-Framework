package CollectionFramework.GenericMethod;

import java.util.List;

public class Test {
    public static<T extends Animal> void store(List<T> l) {
        System.out.println("Test Method");
    }
}
