package Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class findsumofTriplets {

    // Time complexity: O(n^2)
    private static List<Integer[]> findThreeSum_Sorting(int[] nums, int target)

    {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)

        {
            int currentTarget = target - nums[i];
            Set<Integer> existingNums = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++)

            {
                if (existingNums.contains(currentTarget - nums[j])) {
                    result.add(new Integer[] { nums[i], nums[j], currentTarget - nums[j] });
                } else
                {
                    existingNums.add(nums[j]);
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};


        int target = 6;

        List<Integer[]> result = findThreeSum_Sorting(nums, target);

        if(result.isEmpty())
        {
            System.out.print(" no matching values ");
        }
        else
        {

            for(Integer[] triplets: result)
            {
                for(int num: triplets)
                {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
