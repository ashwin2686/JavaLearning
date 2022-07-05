package Arrays;

import java.util.HashSet;

public class FindcommonNumbers {

    static void findCommon(int a[], int b[], int c[], int n1, int n2,int n3)
    {
        // three sets to maintain frequency of elements
        HashSet<Integer> uset = new HashSet<>();
        HashSet<Integer> uset2 = new HashSet<>();
        HashSet<Integer> uset3 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            uset.add(a[i]);
        }
        for (int i = 0; i < n2; i++) {
            uset2.add(b[i]);
        }
        // checking if elements of 3rd array are present in
        // first 2 sets
        for (int i = 0; i < n3; i++) {
            if (uset.contains(c[i]) && uset2.contains(c[i])) {
                // using a 3rd set to prevent duplicates
                if (uset3.contains(c[i]) == false)
                    System.out.print(c[i]+" ");
                uset3.add(c[i]);
            }
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int n1 = ar1.length;
        int n2 = ar2.length;
        int n3 = ar3.length;

        System.out.println("Common Elements are ");
        findCommon(ar1, ar2, ar3, n1, n2, n3);
    }
}

// This code is contributed by shinjanpatra
