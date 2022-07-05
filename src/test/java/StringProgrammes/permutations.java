// Java program to print all the permutations
// of the given string
public class permutations {

    static int count = 1;
    static int counter = 1;
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {

            System.out.println( "counter: "+counter);
            System.out.println( "str: "+str);
            counter++;
            System.out.println("permutation : "+ans );
            return;

        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println( "str in loop : " +str);
            // ith character of str
            char ch = str.charAt(i);
            System.out.println( "ch: " +ch);

            // Rest of the string after excluding
            // the ith character
            /*String ros = str.substring(0, i) +
                    str.substring(i + 1);*/
            String ros = str.substring(0, i) + str.substring(i + 1);
            System.out.println( "i: " +i);
            System.out.println( "str.substring(0, i): " +str.substring(0, i));
            System.out.println( "str.substring(i + 1): " +str.substring(i + 1));
            System.out.println( "ros: " +ros);

            // Recursive call
            System.out.println( "count: "+count);
            count++;

            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "123";
        printPermutn(s, "");


    }
}
