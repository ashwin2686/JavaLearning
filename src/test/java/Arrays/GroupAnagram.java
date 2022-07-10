package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.*;
// Java program to print anagrams
// together using dictionary

public class GroupAnagram {


        private static void printAnagrams(String arr[])
        {
            HashMap<String, List<String>> map
                    = new HashMap<>();

            // loop over all words
            for (String word :arr ) {

                // convert to char array, sort and
                // then re-convert to string

                char[] Characters = word.toCharArray();
                Arrays.sort(Characters);
                String sorted = new String(Characters);

                // calculate hashcode of string
                // after sorting
                if (!map.containsKey(sorted)) {

                    // This is the first time we are
                    // adding a word for a specific
                    // hashcode

                    List<String> values = new ArrayList<>();
                    values.add(word);
                    map.put(sorted, values);
                }
                else {


                    map.get(sorted).add(word);
                }
            }

            // print all the values where size is > 1
            // If you want to print non-anagrams,
            // just print the values having size = 1
            for (String s : map.keySet()) {
                List<String> values = map.get(s);
                if (values.size() > 1) {
                    System.out.print(values);
                }
            }
        }

        public static void main(String[] args)
        {

            // Driver program
            String arr[]
                    = { "cat", "dog", "tac", "god", "act" };
            printAnagrams(arr);
        }
    }


