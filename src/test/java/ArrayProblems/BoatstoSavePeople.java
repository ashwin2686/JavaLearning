package ArrayProblems;

import java.util.Arrays;

public class BoatstoSavePeople {


    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;

       int boatsTaken = numboats(  people , limit ) ;

        System.out.println("boatsTaken:  "+boatsTaken);

    }
    public static int numboats( int[] people ,int limit )
    {

        Arrays.sort(people);
        int i=0;
        int j= people.length-1;

        int numboats=0;
        while (i<=j)
        {
            if(people[i]+people[j]<=limit )
            {

                i++;
                j--;

            }
            else
            {
                j--;
            }

            numboats++;
        }




        return numboats;


    }
}
