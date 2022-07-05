import java.util.HashSet;
import java.util.Set;

public class Findpairofintegerseequalsum {


    public static void main(String args[]) {


        int numbers[] = {1, 56, -1, -20, -40};
        int n = -19;

        Set set = new HashSet(numbers.length);
        for(int value : numbers)
        {
            int target = n - value; // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);

            }else
            {
                System.out.printf("(%d, %d) %n", value, target);

            }
        }


    }
}
