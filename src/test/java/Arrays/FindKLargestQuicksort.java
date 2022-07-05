package Arrays;
import java.util.*;

public class FindKLargestQuicksort {


    static int findRandomPivot(int arr[], int low, int high)
    {

        // Selecting the random pivot index

        int pivot = arr[high];
        //initialising pivoting point to start index
        int i = low-1;
        for (int j = low; j <= high-1; j++) {

            // If an element is lesser than pivot, swap it.
            if (arr[j] <= pivot) {

                i++;
                int temp1 = arr[i];
                arr[i]= arr[j];
                arr[j] = temp1;

                // Incrementing pivotIndex for further
                // swapping.

            }
        }

        // Lastly swapping or the
        // correct position of pivot
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
//THIS PART OF CODE IS CONTRIBUTED BY - rjrachit

    static void SmallestLargest(int a[], int low, int high, int k,
                                int n)
    {
        if (low == high)
            return;
        else {
            int pivotIndex = findRandomPivot(a, low, high);


            if (k == pivotIndex) {


                //print an array

                for(int i = 0; i < n; i++)
                    System.out.print(a[i] + " ");


                System.out.print(k+ " smallest elements are : ");
                for (int i = 0; i < pivotIndex; i++)
                    System.out.print(a[i]+ " ");

                System.out.println();

                System.out.print(k+ " largest elements are : ");
                for (int i = (n - pivotIndex); i < n; i++)
                    System.out.print(a[i]+ " ");
            }

            else if (k < pivotIndex)
                SmallestLargest(a, low, pivotIndex - 1, k, n);

            else if (k > pivotIndex)
                SmallestLargest(a, pivotIndex + 1, high, k, n);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int n = a.length;

        int low = 0;
        int high = n - 1;

        // Lets assume k is 3
        int k = 3;

        //print an array

        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        // Function Call
        SmallestLargest(a, low, high, k, n);
    }
}

