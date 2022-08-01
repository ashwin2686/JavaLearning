package ArrayProblems;




// Java program to print all permutations of a
// given string.
public class FindPermutationString
{
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n-1);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private static void permute(String str, int l, int r)
    {

        System.out.println("l outside loop "+l);
        if (l == r) {
            System.out.println(str);
            System.out.println("");
        }
        else
        {
            for (int i = l; i <= r; i++)
            {

            	System.out.println("i is "+i);
                System.out.println("l is "+l);

                str = swap(str,l,i);

                System.out.println("i after first swap "+i);
                System.out.println("l after first swap "+l);


                permute(str, l+1, r);

                str = swap(str,l,i);


            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}

// This code is contributed by Mihir Joshi
