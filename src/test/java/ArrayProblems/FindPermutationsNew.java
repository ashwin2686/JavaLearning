package ArrayProblems;

import java.util.ArrayList;
import java.util.List;



class FindPermutationsNew {
    private void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean []freq) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums, ds, ans, freq);
        return ans;
    }

    public static void main (String args[])
    {

        FindPermutationsNew Perm = new FindPermutationsNew();

        int num[] = {1,2,3};

        List<List<Integer>> allPermutatios = Perm.permute( num);

        System.out.println(" Permutatons");
        for( int i=0 ; i< allPermutatios.size();i++) {
            for (int j = 0; j < allPermutatios.get(i).size(); j++) {
                System.out.print(allPermutatios.get(i).get(j) + " ");

            }
            System.out.println();
        }





    }
}

