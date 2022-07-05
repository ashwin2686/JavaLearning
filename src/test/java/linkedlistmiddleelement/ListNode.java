package linkedlistmiddleelement;

 class ListNode1 {
    int val;
     ListNode1 next;
     ListNode1(int val) {
        this.val = val;
    }
}
class middleelementLinkedListExample {

    private static ListNode1 middleoneLinkedList(ListNode1 head) {
        ListNode1 fast_pointer = head;
        ListNode1 slow_pointer = head;

        while(fast_pointer != null &&fast_pointer.next != null ) {

            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }
        return slow_pointer;
    }

    public static void main(String[] args) {
        ListNode1 node = new ListNode1(1);
        node.next = new ListNode1(2);
        node.next.next = new ListNode1(3);
        node.next.next.next = new ListNode1(4);
        node.next.next.next.next = new ListNode1(5);
        node.next.next.next.next.next = new ListNode1(6);
        node.next.next.next.next.next.next = new ListNode1(7);
        node.next.next.next.next.next.next.next = new ListNode1(8);



        printList(node);


        ListNode1 mNode = middleoneLinkedList(node);

        System.out.print("mNode.val:  "+mNode.val + " ");



    }

    public static void printList(ListNode1 head)
    {
        ListNode1 tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.val+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }
}
