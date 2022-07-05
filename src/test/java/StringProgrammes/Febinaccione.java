package StringProgrammes;

public class Febinaccione {


    public static long[] longarray;

    public static void main(String... args) {

        int n = 10;
        longarray = new long[n + 1];


        for (int i = 0; i < n; i++) {
            System.out.print(febinacci(i) + " ");
        }


    }

    private static long febinacci(int n) {

        if (n <= 1) {
            return n;

        }
        if (longarray[n] != 0) {
            return longarray[n];
        }


        long nfeb = (febinacci(n - 1) + febinacci(n - 2));
        longarray[n] = nfeb;
        return nfeb;


    }
}
