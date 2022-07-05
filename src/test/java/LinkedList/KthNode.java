package LinkedList;


// Simple Java program to find n'th node from end of linked list
public class KthNode {

    Node head; // head of the list

    /* Linked List node */
    static  class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to get the nth node from the last of a
    linked list */
    void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of
        // the linked list
        if (len < n) {
            System.out.println("not found");
            return;
        }

        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*Driver program to test above methods */
    public static void main(String[] args)
    {
        KthNode llist = new KthNode();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        System.out.println("Print List");
        printList(llist.head);



        llist.printNthFromLast(5);
    }



    public static void printList(Node head)
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }
} // This code is contributed by Rajat Mishra
