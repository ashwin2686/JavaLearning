package ArrayProblems;



// Java program to print largest
// contiguous array sum
class LargestSubarray {

    static void maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
                current_max = 0,
                startIndex = 0,
                endIndex = 0;


        //{ -2, -3, 4, -1, -2, 1, 5, -3 };


        if(size==1)
        {
            max_so_far= a[0];
        }


        for (int i = 0; i < size; i++)
        {

            if (max_so_far < current_max)
            {
                max_so_far = current_max;

                System.out.println("end :"+ i);

                endIndex = i;
            }


            current_max += a[i];

            if (current_max < 0)
            {
                current_max = 0;
                startIndex = i + 1;

            }




        }
        System.out.println("Maximum contiguous sum is "
                + max_so_far);
        System.out.println("Starting index " + startIndex);
        System.out.println("Ending index " + endIndex);
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { -2,1,-3,4,-1,2,1,-5,4 };
       // int a[] = { 5,4,-1,7,8 };
        int n = a.length;
        maxSubArraySum(a, n);
    }
}

