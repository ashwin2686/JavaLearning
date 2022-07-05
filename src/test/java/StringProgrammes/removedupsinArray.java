package StringProgrammes;

import java.util.*;
import java.util.stream.Collectors;

public class removedupsinArray {

    public static void main(String... args) {

       int arr[] = {1,2,3,3,4,5,5};
        List<Integer> list = Arrays.stream(arr)        // IntStream
                .boxed()          // Stream<Integer>
                .collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(list);
       // ArrayList<Integer> removedDuplicates = new ArrayList(set);
        System.out.println( set);


    }
}
