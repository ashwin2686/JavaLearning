package RemoveNthnode;

 class ListNode1 {
    int val;
     ListNode1 next;
     ListNode1(int val) {
        this.val = val;
    }
}
class removeNthnodeclass {

    private static ListNode1 removeNthnode(ListNode1 head, int n) {

        ListNode1 dummy_node = new ListNode1(0) ;
        dummy_node.next = head;


        ListNode1 fast_pointer = dummy_node;
        ListNode1 slow_pointer = dummy_node;


        for (int i=0 ; i<=n; i++)
        {
            fast_pointer = fast_pointer.next;
        }

        while(fast_pointer != null ) {

            fast_pointer = fast_pointer.next;
            slow_pointer = slow_pointer.next;
        }

        slow_pointer.next = slow_pointer.next.next;


        return dummy_node.next;
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


        System.out.println("Before");
        printList(node);


        ListNode1 mNode = removeNthnode(node,2);

        System.out.println("After");

        printList(mNode);



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
