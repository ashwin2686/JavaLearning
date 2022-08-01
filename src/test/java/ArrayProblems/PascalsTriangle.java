package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


    public static List<List<Integer>>  generate (int numrows)
    {

        List<List<Integer>> traingle = new ArrayList<>();


        if( numrows==0)

            return  traingle;

        List<Integer> first_row = new ArrayList<>();

        first_row.add(1);

        traingle.add(first_row);

        for (int i=1 ;i<numrows ; i++)
        {
            List<Integer> prev_row = traingle.get(i-1);
            List<Integer> new_row = new ArrayList<>();

            new_row.add(1);

            for ( int j =1 ; j<i ;j++)
            {
                new_row.add(prev_row.get(j-1)+prev_row.get(j));

            }

            new_row.add(1);

            traingle.add(new_row);

        }



        return  traingle;
    }

    public static void main(String[] args) {


        List<List<Integer>> pascal_triangle = generate (5);


        for( int i=0 ; i< pascal_triangle.size();i++) {
            for (int j = 0; j < pascal_triangle.get(i).size(); j++) {
                System.out.print(pascal_triangle.get(i).get(j) + " ");

            }
            System.out.println();
        }


    }
}
