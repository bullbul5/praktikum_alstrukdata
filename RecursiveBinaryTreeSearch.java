class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class RecursiveBinaryTreeSearch {
    public static TreeNode search(TreeNode root, int key) {
        if (root == null || root.val == key) {
            return root;
        }
        if (key < root.val) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        int key = 7;
        TreeNode result = search(root, key);
        if (result != null) {
            System.out.println("Elemen " + key + " ditemukan dalam pohon binari.");
        } else {
            System.out.println("Elemen " + key + " tidak ditemukan dalam pohon binari.");
        }
    }
}
