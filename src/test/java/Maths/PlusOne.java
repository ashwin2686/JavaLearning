package Maths;

import java.util.Arrays;

public class PlusOne {




    public static int[] plusone ( int [] digits)
    {


        for (int i=digits.length-1 ;i>=0 ;i-- ) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;

            }
            digits[i] = 0;

        }
        int results[] = new int[digits.length+1];
        results[0] =1;

        return results;
    }

    public static void main(String[] args) {

        int digits[] = {4,3,2,9};

        int digitsplusone[] = plusone(digits);

        System.out.println(Arrays.toString(digitsplusone));

    }
}
