package Arrays;
import java.util.*;

public class Uniquepath2 {


// Java program to count all possible paths from
// top left to top bottom right using
// Recursive Dynamic Programming



    // Returns count of possible paths to reach
    // cell at row number m and column number n from
    // the topmost leftmost cell (cell at 1, 1)
    static int uniquePathsUtil(int m, int n, int DP[][])
    {

        if(m == 1 || n == 1) return 1;
        if(DP[m][n] != 0)
            return DP[m][n];
        return DP[m][n] = uniquePathsUtil(m-1, n, DP) + uniquePathsUtil(m, n-1, DP);

    }

    // Driver code
    private static int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        return uniquePathsUtil(m, n, dp);
    }

    public static void main(String[] args){
        System.out.print(uniquePaths(2,3));
    }
}

// This code is contributed
// by Samim Hossain Mondal.
