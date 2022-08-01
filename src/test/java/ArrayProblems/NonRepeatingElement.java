package ArrayProblems;


// Efficient Java program to find first non-
// repeating element.
import java.util.*;

class NonRepeatingElement {

    static int firstNonRepeating(int arr[], int n)
    {
        // Insert all array elements in hash
        // table

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {

                int counter = m.get(arr[i]);
                m.put(arr[i], counter + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        // Traverse array again and return
        // first element with count 1.
        for (Integer number : m.keySet())
            if (m.get(number) == 1)
                return number;
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
        System.out.println(firstNonRepeating(arr, n));
    }
}

// This code contributed by Rajput-Ji
