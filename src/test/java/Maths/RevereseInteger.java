package Maths;

public class RevereseInteger {



    public static int reverse ( int num)
    {

        boolean negative = false;
        if(num <0) {
            negative = true;
            num *= -1;
        }

        long reversed =0;

        while (num >0)

        {

            reversed = reversed*10 + (num%10);

            num = num/10;
        }

        return negative ? (int) (-1 *reversed ) : (int) (reversed );


    }

    public static void main(String[] args) {

        System.out.println(reverse (  123));

        //System.out.println(reverse (  -1345));
    }
}
