package Arrays;

public class MaxAreaofwater {


    public static int maxArea(int A[])
    {

        int len = A.length;

        int l = 0;
        int r = len -1;
        int area = 0;

        while (l < r)
        {
            // Calculating the max area
            area = Math.max(area,
                    Math.min(A[l], A[r]) * (r - l));

            if (A[l] < A[r])
                l += 1;

            else
                r -= 1;
        }
        return area;
    }

    public static void main(String[] args)
    {
        int a[] = {1, 5, 4, 3};
        int b[] = {3, 1, 2, 4, 5};


        System.out.print( maxArea(a)+"\n" );


        System.out.print( maxArea(b) );
    }
}

// This code is contributed by rishabh_jain
