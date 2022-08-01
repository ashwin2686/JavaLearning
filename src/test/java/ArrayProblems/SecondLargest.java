package ArrayProblems;

public class SecondLargest {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 5, 11, 8, 10, 9};

        int n = input.length;


        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        System.out.println("highest : "+highest);


        for (int i =0 ;i <n ; i++)
        {

            if(input[i] >highest)
            {
                secondHighest = highest;

                highest = input[i];

            }

            if(input[i]< highest && input[i]> secondHighest)
            {
                secondHighest = input[i];
            }
        }


        System.out.println("secondHighest value is : "+secondHighest);


    }

}
