package ArrayProblems;



import java.util.*;


public class FindPairstoSUm {


    public static void main(String args[]) {


        int numbers[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3};
        int n = 4;

        findpairs(numbers,n);


    }

    private static void findpairs(int[] numbers, int n) {


        int hit=0;

        List<Integer> set = new ArrayList<>(numbers.length);
        for(int value : numbers)
        {
            hit++;
            int target = n - value; // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);

            }else
            {
                System.out.printf("(%d, %d) %n", value, target);
                set.remove(target);

            }
        }

        System.out.printf("hit" +hit);



    }


    private static void findpairsMap(int[] numbers, int sum) {


        int hit=0;

        Map<Integer,Integer> map = new HashMap<>(numbers.length);
        for(int value : numbers)
        {

            if(map.containsKey(value))
            {

                map.put(value, map.get(value)+1);


            }else
            {
                map.put(value, 1);
            }


        }

        System.out.printf("map" +map);


        for ( Integer key :map.keySet() )
        {
            int value = sum-key;

            if(map.containsKey(value) && map.get(key)>0 && map.get(value)>0)
            {

                System.out.println("key"+key +"value"+value);
                //map.put(value, map.get(value)-1);
                //map.put(value, map.get(value)-1);



            }


        }


    }



}