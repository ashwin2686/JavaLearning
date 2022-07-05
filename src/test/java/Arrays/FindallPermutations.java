package Arrays;

import java.util.*;
class FindallPermutations {
    private void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
        if (index == nums.length) {
            // copy the ds to ans
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }

            System.out.println("ds is "+ds);
            System.out.println();

            ans.add(new ArrayList < > (ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {

            System.out.println("i before is :" +i);
            System.out.println("index before is :" +index);
            swap(i, index, nums);
            //System.out.println("i after is :" +i);
            System.out.println("index after is :" +(index + 1));
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public List < List < Integer >> permute(int[] nums) {
        List < List < Integer >> ans = new ArrayList < > ();
        recurPermute(0, nums, ans);
        return ans;
    }
};

class TUF {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        FindallPermutations sol = new FindallPermutations();
        List < List < Integer >> ls = sol.permute(nums);
        System.out.println("All Permutations are ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}