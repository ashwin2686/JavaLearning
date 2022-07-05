package Arrays;


// Java program to merge two sorted arrays
import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Mergearraygfg
{
    // Merge arr1[0..n1-1] and arr2[0..n2-1]
    // into arr3[0..n1+n2-1]

    public static void main (String[] args)
    {
        int[] first = {1, 3, 5, 7,10,12,14,16};
        int n1 = first.length;

        int[] second = {2, 4, 6, 8,9,11,13,15};
        int n2 = second.length;


        int[] mergedarray =  mergeArrays(first, second);

        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(mergedarray[i] + " ");
    }
    public static int[] mergeArrays(int[] first, int[] second)
    {

        int firsthigh = first.length;
        int secondhigh = second.length;
        int firstindex = 0, secondindex = 0, mergedindex = 0;
        int[] mergedarray = new int[firsthigh+secondhigh];

        // Traverse both array
        while (firstindex<firsthigh && secondindex <secondhigh)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (first[firstindex] < second[secondindex])

                mergedarray[mergedindex++] = first[firstindex++];
            else
                mergedarray[mergedindex++] = second[secondindex++];
        }

        // Store remaining elements of first array
        while (firstindex < firsthigh) {
            mergedarray[mergedindex++] = first[firstindex++];
        }

        // Store remaining elements of second array
        while (secondindex < secondhigh) {
            mergedarray[mergedindex++] = second[secondindex++];
        }
        return mergedarray;
    }




}

/* This code is contributed by Mr. Somesh Awasthi */
