package ArrayProblems;
import java.util.HashMap;
import java.util.Map;

/* Program for finding out majority element in an array */


public class MajorityElement {

    private static void findMajority(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr) {
            if (map.containsKey(i)) {
                int count = map.get(i) +1;
                if (count > arr.length /2) {
                    System.out.println("Majority found :- " + i);
                    return;
                } else
                    map.put(i, count);

            }
            else
                map.put(i,1);
        }
        System.out.println(" No Majority element");
    }


    /* Driver program to test the above functions */
    public static void main(String[] args)
    {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3};

        findMajority(a);
    }
}
// This code is contributed by karan malhotra
