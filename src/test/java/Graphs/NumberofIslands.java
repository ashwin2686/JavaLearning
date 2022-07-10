package Graphs;
import java.util.*;

public class NumberofIslands {


// Java Program to count islands in boolean 2D matrix


    // A utility function to do DFS for a 2D
    // boolean matrix. It only considers
    // the 8 neighbours as adjacent vertices
    static int  DFS(int[][] grid, int i, int j)
    {

        // Base condition
        // if i less than 0 or j less than 0 or i greater than ROW-1 or j greater than COL- or if M[i][j] != 1 then we will simply return
        if (i < 0 || j < 0 || i > (grid.length - 1) || j > (grid[i].length - 1) || grid[i][j] == 0)
        {
            return 0;
        }


        grid[i][j] = 0;
            DFS(grid, i + 1, j);   //right side traversal
            DFS(grid, i - 1, j);   //left side traversal
            DFS(grid, i, j + 1);   //upward side traversal
            DFS(grid, i, j - 1);   //downward side traversal
           return 1;

    }

    static int numIslands(int[][] grid)
    {

        if(grid== null || grid.length==0)
        {
            return 0;
        }


        int numIslands = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                if (grid[i][j] == 1)
                {
                    numIslands += DFS(grid,i,j);
                }
            }
        }
        return numIslands;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] M = {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}};

        System.out.print("Number of islands is: " + numIslands(M));
    }
}

// time complexity O(n*m);
