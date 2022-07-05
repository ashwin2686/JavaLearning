package Arrays;

public class FindDuplicatewithNoextraSpace {

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        //int nums[] = {1,2,2,3,4};
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println("slow: "+slow);
            System.out.println("fast: "+fast);
            if (slow == fast)


                break;
        }

        return slow;

        /*int slow2 = 0;
        while(true){
            slow=nums[slow];
            slow2=nums[slow2];
            System.out.println("after break");
            System.out.println("slow2: "+slow2);
            System.out.println("slow: "+slow);
            System.out.println("slow2: "+slow2);

            if (slow==slow2)
                return slow;
        }*/
    }

    public static void main(String[] args) {


        int nums[] = {1,2,2,3,4};
        int dup = findDuplicate( nums);
        System.out.println("dup: " + dup);


    }
}
