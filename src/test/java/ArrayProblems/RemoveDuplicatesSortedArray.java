package ArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class  RemoveDuplicatesSortedArray {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;

        /*
         * This index will move only when we modify the array in-place to include a new
         * non-duplicate element.
         */
        int j = 0;

        for (int i = 0; i < n; i++) {
            /*
             * If the current element is equal to the next element, then skip the current
             * element because it's a duplicate.
             */
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[j] = nums[i];
            j++;
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 3, 5, 5, 7 };
        int newLength = removeDuplicates(nums);

        System.out.println("Length of array after removing duplicates = " + newLength);

        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        List<String> newone = new ArrayList<>();




        newone.add("one");
        newone.add("two");
        newone.add("three");

        List<String> newlatest = newone.stream().map( e -> {

            if(e.contains("one"))
            {
                return e+"1";
            }
            else

                return e;
        }).collect(Collectors.toList());

        System.out.println(newlatest);




    }
}
