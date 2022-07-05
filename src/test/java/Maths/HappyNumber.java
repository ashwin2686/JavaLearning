package Maths;

import java.util.HashSet;

public class HappyNumber {

    public static boolean ishappy(int n)
    {
        HashSet<Integer> seen = new HashSet<>();

        while (n!=1)
        {
            int current =1;
            int sum=0;

            while (current!=0)
            {
                sum+= (current%10)*(current%10);
                current= current/10;

            }


            if(seen.contains(sum))
            {
                return false;

            }

                seen.add(sum);
                n= sum;

        }


        return true;
    }


    public static void main(String[] args) {

        int number = 19;

        System.out.println(ishappy(number));
    }

}