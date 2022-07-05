package Arrays;

import java.util.*;
// Java program to Print all possible paths from
// top left to bottom right of a mXn matrix

public class UniquePaths {








    private static void printMatrix(int mat[][], int m, int n,
                                    int i, int j, List<Integer> list)
    {
        //return if i or j crosses matrix size


        if(i > m || j > n)
            return;
        list.add(mat[i][j]);
        if(i == m && j == n){
            System.out.println(list);
        }
        printMatrix(mat, m, n, i+1, j, list);
        printMatrix(mat, m, n, i, j+1, list);
        list.remove(list.size()-1);


    }

    // Driver code
    public static void main(String[] args)
    {
        int m = 2;
        int n = 3;
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 } };
        List<Integer> list = new ArrayList<>();
        printMatrix(mat, m-1, n-1, 0, 0, list);
    }
}

