import java.util.*;

public class removedupsinArray {

    public static void main(String... args) {


        List<Integer> list = Arrays.asList(1,2,3,3,4,5,5);

        Set<Integer> set = new HashSet<>(list);
        ArrayList<Integer> removedDuplicates = new ArrayList(set);
        System.out.println( removedDuplicates);


    }
}
