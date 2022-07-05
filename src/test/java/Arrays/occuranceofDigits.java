package Arrays;

public class occuranceofDigits {


    public static void main (String[] args)

    {

       int n1 = 05;
       int n2 = 9;


        int n = 12, count = 0;

        int d = 2;

        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);

    }
}
