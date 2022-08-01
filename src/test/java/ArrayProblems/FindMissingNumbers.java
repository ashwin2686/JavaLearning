package ArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingNumbers {



    public static void main(String[] args) {

        int numbers[] = {4,3,2,7,8,2,3,1};

        List<Integer> missingNumbers = missingNumbersfunction(numbers);
        System.out.println(missingNumbers);



    }

    private static  List<Integer> missingNumbersfunction(int[] numbers) {

        List<Integer> missingNums = new ArrayList<>();
        Set<Integer> nums = new HashSet<>();

        for (int i:numbers )
        {
            nums.add(i);

        }

        for (int i=1; i<= numbers.length;i++ )
        {
            if(!nums.contains(i))
            {
                missingNums.add(i);
            }

        }



        return missingNums;
    }


}
