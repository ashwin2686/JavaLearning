package Tree;

// Java program to check if a given tree is BST.

public class ValidateBST {


    // A binary tree node has data, pointer to
//left child && a pointer to right child /
    static class Node
    {
        int data;
        Node left, right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }

    }

    // Returns true if given tree is BST.
    static boolean isBST(Node root, Node l, Node r)
    {
        // Base condition
        if (root == null)
            return true;

        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (l != null && root.data <= l.data)
            return false;

        // if right node exist then check it has
        // correct data or not i.e. right node's data
        // should be greater than root's data
        if (r != null && root.data >= r.data)
            return false;

        // check recursively for every node.
        return isBST(root.left, l, root) &&
                isBST(root.right, root, r);
    }



    // Driver code
    public static void main(String args[])
    {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root,null,null))
            System.out.print("Is BST");
        else
            System.out.print("Not a BST");
    }
}

