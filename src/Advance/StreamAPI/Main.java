package Advance.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=List.of(12,2,37,32,85,54,84);
        System.out.println(list);

        // Way 1
        List<Integer> listEven=new ArrayList<>();
        for(Integer num:list){
            if(num%2==0){
            listEven.add(num);}
        }
        System.out.println(listEven);

        // Way 2 using stream api

        Stream<Integer> stream=list.stream();
        System.out.println(stream.filter((i)->i%2==0).collect(Collectors.toList()));


        String[] names={"Kamlesh","Uttam","Divya","Ankit"};
        System.out.println(Arrays.toString(names));

        //Stream.of
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        Stream<String> stream2=Arrays.stream(names);
        stream2.forEach(e->{
            System.out.println(e);
        });

        Stream.of(names).filter(name->name.startsWith("A")).forEach(System.out::println);

        // map
        List<Integer> numbers=List.of(5,2,4,1,6,3);
        numbers.stream().map(num->num*num).forEach(System.out::println);
    }
}
