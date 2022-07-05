package LinkedlistReverse;

 class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class ReverseLinkedListExample {

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;

        while(currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);


        ListNode rNode = reverseLinkedList(node);
        while(rNode != null) {
            System.out.print(rNode.val + " ");
            rNode = rNode.next;
        }
        System.out.println();
    }
}
