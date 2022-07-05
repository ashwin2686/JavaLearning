package Tree;



// Java program to find height of tree

// A binary tree node
public class NodeDepth
{
    int data;
    NodeDepth left, right;

    NodeDepth(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTreeDepth
{
    NodeDepth root;

    /* Compute the "maxDepth" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int maxDepth(NodeDepth node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        BinaryTreeDepth tree = new BinaryTreeDepth();

        tree.root = new NodeDepth(1);
        tree.root.left = new NodeDepth(2);
        tree.root.right = new NodeDepth(3);
        tree.root.left.left = new NodeDepth(4);
        tree.root.left.right = new NodeDepth(5);

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }
}

// This code has been contributed by Amit Srivastav
