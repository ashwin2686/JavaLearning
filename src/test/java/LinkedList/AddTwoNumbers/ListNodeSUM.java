package LinkedList.AddTwoNumbers;






public class ListNodeSUM {
    int val;
    ListNodeSUM next;
    ListNodeSUM(int val) {
        this.val = val;
    }
}
class AddTwoNumbers {

    // O(max(l1.size, l2.size))
    private  static ListNodeSUM addTwoNumbers(ListNodeSUM l1, ListNodeSUM l2) {
        ListNodeSUM result = null, head = null;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;

            int value  = sum%10;
            carry = sum/10;
            ListNodeSUM node = new ListNodeSUM(value);
            if(result == null) {
                result  = node;
                head = node;
            } else {
                result.next = node;
                result = result.next;
            }
        }
        if(carry > 0) {
            result.next = new ListNodeSUM(carry);
        }
        return head;
    }

    public static void main(String[] args) {

        ListNodeSUM l1 = new ListNodeSUM(2);
        l1.next = new ListNodeSUM(4);
        l1.next.next = new ListNodeSUM(3);
        l1.next.next.next = new ListNodeSUM(7);
        l1.next.next.next.next = new ListNodeSUM(9);

        ListNodeSUM l2 = new ListNodeSUM(5);
        l2.next = new ListNodeSUM(6);
        l2.next.next = new ListNodeSUM(8);

        ListNodeSUM result = addTwoNumbers(l1, l2);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}