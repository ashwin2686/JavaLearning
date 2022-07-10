package Arrays;

public class InsertionSort {

    /*Function to sort array using insertion sort*/

    //int arr[] = { 12, 11, 13, 5, 6 };
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int currentValue = arr[i];
            System.out.println( "key first is : "+currentValue);
            int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            System.out.println( "j is : "+j);
            System.out.println( "key is : "+currentValue);
            arr[j + 1] = currentValue;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
} /* This code is contributed by Rajat Mishra. */
