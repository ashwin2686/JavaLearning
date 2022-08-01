package ArrayProblems;



// Java program for the above approach
import java.io.*;
        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Set;

public class FindcommonandDifferentinArray {


    private static void findCommonElements(int[] arr1,
                                           int[] arr2)
    {

        // Check if length of arr1 is greater than 0
        // and length of arr2 is greater than 0


        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }



    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = new int[] { 1, 3, 4, 5, 6, 9, 8 };

        // Function Call
        findCommonElements(arr1, arr2);
    }
}

