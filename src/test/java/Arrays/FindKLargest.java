package Arrays;

import java.util.PriorityQueue;

public class FindKLargest {


    public static void main (String [] args)
    {
        int[] input = {1, 2, 3, 5, 11, 8, 10, 9};

        int k = 3; int maxvalue, smallvalue;

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i: input)
        {
            minheap.add(i);

            if(minheap.size()>k) {
                minheap.remove();
            }
        }

        maxvalue = minheap.remove();

        System.out.println("value is "+maxvalue);











    }
}
