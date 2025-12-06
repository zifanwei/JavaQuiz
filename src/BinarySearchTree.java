class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insertion operation
    void insert(int key) {
        root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Deletion operation
    void delete(int key) {
        root = deleteRec(root, key);
    }

    TreeNode deleteRec(TreeNode root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Search operation
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(TreeNode root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data < key)
            return searchRec(root.right, key);
        return searchRec(root.left, key);
    }

    // Inorder traversal
    void inorder() {
        inorderRec(root);
        System.out.println("\n");
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal
    void preorder() {
        preorderRec(root);
        System.out.println("\n");

    }

    void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder traversal
    void postorder() {
        postorderRec(root);
        System.out.println("\n");
    }

    void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
    // Main Function
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Inserting elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();

        // Deleting elements
        tree.delete(20);
        tree.delete(30);

        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        // Searching for an element
        int searchKey = 70;
        System.out.println("Is " + searchKey + " present in the tree? " + tree.search(searchKey));

        // Traversals
        System.out.println("Preorder traversal:");
        tree.preorder();

        System.out.println("Postorder traversal:");
        tree.postorder();
    }
}
