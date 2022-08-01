package ArrayProblems;
import java.util.Arrays;
public class RotateArraybyK {



 public static void main(String[] args) {
     int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
     int k = 4;
     System.out.println("Rotate given array " + Arrays.toString(input) + " by 4 places to the left.");
     int[] rotatedleftArray = rotateLeft(input,  k);
     System.out.println("Rotated left array: " + Arrays.toString(rotatedleftArray));

     int[] rotatedrightArray = rotateRight(input,  k);
     System.out.println("Rotated right array: " + Arrays.toString(rotatedrightArray));
 }

    private static int[] rotateRight(int[] input, int k) {


        for (int i=0; i<k ;i++)
        {
            int temp = input[input.length-1];

            for (int j=input.length-1; j> 0;j--)
            {
                input[j] = input[j-1];
            }

            input[0] = temp;


        }

     return input;

    }

    private static int[] rotateLeft(int[] input,  int k) {


        for (int i=0; i<k ;i++)
        {
            int temp = input[0];

            for (int j=0; j< input.length-1;j++)
            {
                input[j] = input[j+1];
            }

            input[input.length-1] = temp;


        }
        return input;
    }
}

