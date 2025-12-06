
public class TreeTraversal {

    // Inorder Traversal
    public static void printInorder(TreeNode node) {
        if (node == null)
            return;

        // Traverse left subtree
        printInorder(node.left);

        // Visit node
        System.out.print(node.data + " ");

        // Traverse right subtree
        printInorder(node.right);
    }


    // Preorder Traversal
    public static void printPreorder(TreeNode node) {
        if (node == null)
            return;

        // Visit node
        System.out.print(node.data + " ");

        // Traverse left subtree
        printPreorder(node.left);

        // Traverse right subtree
        printPreorder(node.right);
    }

    // Preorder Traversal
    public static void printPostOrder(TreeNode node) {
        if (node == null)
            return;

        // Traverse left subtree
        printPostOrder(node.left);

        // Traverse right subtree
        printPostOrder(node.right);

        // Visit node
        System.out.print(node.data + " ");
    }

    // Driver Code
    public static void main(String[] args) {
        // Build the tree
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(20);
        root.right = new TreeNode(200);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(150);
        root.right.right = new TreeNode(300);

        System.out.println("Preorder Traversal: ");
        printPreorder(root);

        System.out.println("Inorder Traversal: ");
        printInorder(root);

        System.out.println("PostOrder Traversal: ");
        printPostOrder(root);
    }
}

// This code is contributed by Rohit Pradhan https://www.geeksforgeeks.org/dsa/binary-search-tree-traversal-inorder-preorder-post-order/
