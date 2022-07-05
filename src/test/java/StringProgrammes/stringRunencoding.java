package StringProgrammes;

import java.io.*;
public class stringRunencoding {


    public static void encoding(String str)
    {
        int n = str.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {

            // Count occurrences of current character
            int count = 1;
            while (i < n - 1
                    && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Print character and its count
            //System.out.println(str.charAt(i) + "" + count);
            result.append(str.charAt(i) + "" + count);
        }

        System.out.println("result : " + result);

    }

    // Driver code
    public static void main(String[] args)
    {

        String str = "aaabbcdde";
        encoding(str);
    }
}
