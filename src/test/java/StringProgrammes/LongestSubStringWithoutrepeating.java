package StringProgrammes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutrepeating {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hash_Set=new HashSet<>();
        int a_pointer=0,b_pointer=0;
        int max =0;

        while(b_pointer < s.length())
        {
            if(!hash_Set.contains(s.charAt(b_pointer)))
            {
                hash_Set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hash_Set.size(),max);


            }else
            {
                hash_Set.remove(s.charAt(a_pointer));
                a_pointer++;

            }
        }


        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println("length is "+ lengthOfLongestSubstring(s));

    }
    }