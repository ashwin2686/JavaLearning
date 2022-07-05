package LinkedList;




class ListNodeP
{

    int val;
    ListNodeP next;
    ListNodeP(int val) {
        this.val = val;
    }

}




public class LinkedListPalindrome {

    public boolean isPalindrome(ListNodeP head) {
        if(head==null||head.next==null)
            return true;
        ListNodeP slow=head;
        ListNodeP fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverseList(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.val!=slow.val)
                return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    ListNodeP reverseList(ListNodeP head) {
        ListNodeP pre=null;
        ListNodeP current=head;

        while(current!=null){
            ListNodeP Nextnode = current.next;
            current.next=pre;
            pre = current;
            current= Nextnode;

        }
        return pre;
    }
}