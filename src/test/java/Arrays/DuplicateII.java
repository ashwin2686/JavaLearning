package Arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateII {


    public static void main(String[] args) {

        int num [] = {1,2,3,1};
        int k = 3;

        boolean flag = findDuplicate(num,k);

        System.out.println("flag :"+flag);


    }

    private static boolean findDuplicate(int[] num, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int current = num[i];

            if (map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }


        }


        return false;
    }


}



