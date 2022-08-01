package ArrayProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class FindNumbercloseNumberKtimes {

    // Function to find the `k` closest elements to `target` in a sorted integer array `nums`
    public static List<Integer> findKClosestElements(int[] nums, int k, int target)
    {

        List<Integer> listone = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;

        //List<Integer> listone = new ArrayList<>();

        while (right - left >= k)
        {
            if (Math.abs(nums[left] - target) > Math.abs(nums[right] - target)) {


                System.out.println("left"+left);
                left++;

            }
            else {
                System.out.println("right "+right);
                right--;

            }
        }
        System.out.println("left after "+left);
        System.out.println("right after"+right);



        listone = Arrays.stream(nums, left, right + 1).boxed()
                .collect(Collectors.toList());



        return listone;
    }

    public static void main(String[] args)
    {
        int[] nums = {10, 12, 15, 17, 18, 20, 25 };
        int target = 16, k = 4;

        System.out.println(findKClosestElements(nums, k, target));
    }

}
