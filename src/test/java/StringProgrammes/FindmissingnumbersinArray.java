import java.util.Arrays;

public class FindmissingnumbersinArray {
    public static void printMissingElements(int arr[], int N) {
        int cnt = 0;
        for (int i = arr[0]; i <= arr[N - 1]; i++) {

            // Check if number is equal to the first element in
            // given array if array element match skip it increment for next element
            if (arr[cnt] == i) {

                // Increment the count to check next element
                cnt++;
            } else {

                // Print missing number
                System.out.print(i + " ");
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {

        // Given array arr[]
        int arr[] = {0, 6, 7, 10, 11, 13};
        int N = arr.length;

        // Function Call
        printMissingElements(arr, N);
    }
}
