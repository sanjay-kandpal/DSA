class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null; // Base case: if the tree is empty
        }
        
        // Recursively invert the left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        // Swap the left and right children
        root.left = right;
        root.right = left;
        
        return root; // Return the root of the inverted tree
    }
}
