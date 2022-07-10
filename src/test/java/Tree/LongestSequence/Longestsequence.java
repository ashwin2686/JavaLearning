package Tree.LongestSequence;



// Java program to find longest consecutive
// sequence in binary tree

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;

    // method returns length of longest consecutive
    // sequence rooted at node root
    int longestConsecutive(Node root)
    {
        if (root == null)
            return 0;



        int max[]= new int[1];

        // call utility method with current length 0
        longestConsecutiveUtil(root, 0, 0, max);

        return max[0];
    }

    // Utility method to return length of longest
    // consecutive sequence of tree
    private void longestConsecutiveUtil(Node root, int curlength,
                                        int expected, int[] max)
    {
        if (root == null)
            return;

        // if root data has one more than its parent
        // then increase current length
        if (root.data == expected)
            curlength++;
        else
            curlength = 1;

        // update the maximum by current length
        max[0] = Math.max(max[0], curlength);

        // recursively call left and right subtree with
        // expected value 1 more than root data
        longestConsecutiveUtil(root.left, curlength, root.data + 1, max);
        longestConsecutiveUtil(root.right, curlength, root.data + 1, max);
    }

    // Driver code
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(6);
        tree.root.right = new Node(9);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(10);
        tree.root.right.right.right = new Node(11);

        System.out.println(tree.longestConsecutive(tree.root));
    }
}

// This code is contributed by shubham96301
