package Maths;

public class PowerofDoubleNumber {

    public static double myPow(double x, int n) {
        if(x==1) return 1;
        if(x==0) return 0;
        if(n==0) return 1;
        if(n==1) return x;

        double result = x;

        if(n>1){
            /*double divid = myPow(x,n/2);
            result = divid*divid*myPow(x,n%2);*/

            //double divid = myPow(x,n/2);
            //result = divid*divid*myPow(x,n%2);
            return x*myPow( x,  n-1);
        }

        if(n<0){


            result = 1/(myPow(x,-(n+1)) * myPow(x,1));


        }

        return result;

    }

    public static void main(String[] args) {

        double value = myPow( 2,  -2);
        System.out.println("value : "+value);

        int valueinInt = (int) value;
        System.out.println("valueinInt : "+valueinInt);
    }
}
