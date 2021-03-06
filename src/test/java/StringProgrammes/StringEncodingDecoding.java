package StringProgrammes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringEncodingDecoding {

    final char DELIMITER = '#';
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append(DELIMITER);
            sb.append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            //Find the number of characters
            StringBuilder sb = new StringBuilder();
            while(arr[i] != DELIMITER){
                sb.append(arr[i++]);
            }
            i++;

            //Iteration the enter string to add to res list
            int numOfChars = Integer.valueOf(sb.toString());
            int end = i + numOfChars;
            sb = new StringBuilder();
            while(i < end){
                sb.append(arr[i++]);
            }
            i--;
            res.add(sb.toString());
        }
        return res;
    }

    public static void main(String[] args)
    {
        StringEncodingDecoding codec = new StringEncodingDecoding();

        codec.decode("5#hello5#world");

        System.out.println("decode");

        System.out.println(codec.decode("5#hello5#world"));

        List<String> res = new ArrayList<>();

        res.add("hello");
        res.add("world");



        codec.encode(res);

        System.out.println("encode");

        System.out.println(codec.encode(res));



    }


}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));