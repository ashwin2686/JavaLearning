import java.util.HashSet;
import java.util.Set;

public class dupsnArray {

    public static void main(String... args) {


        int arraywithdups []  = {1,2,2,3,4,5,5,6,-1,-1};



        Set<Integer> set = new HashSet<>();
        for (int a :arraywithdups)
        {
            if(!set.add(a))
            {
                System.out.println("dup value in array " +a);

            }
        }



    }
}



