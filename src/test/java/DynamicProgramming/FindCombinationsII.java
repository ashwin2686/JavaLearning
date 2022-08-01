package DynamicProgramming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindCombinationsII {


    public static int combinationSum4(int[] nums, int target) {
        if (nums.length == 1 && nums[0] != target)
            return 0;
        int [] dp = new int [target + 1];
        System.out.println("dp"+ Arrays.stream(dp).boxed().collect(Collectors.toList()));

        for (int i=1; i<=target; i++) {
            for (int number : nums) {
                if (i == number) {
                    dp[i] += 1;
                }
                else if (i - number > 0) {
                    dp[i] += dp[i - number];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {

        int a[] = {1,2,3};
        int target = 4;

        int count = combinationSum4(a,  target);

        System.out.println(count);
    }
}
