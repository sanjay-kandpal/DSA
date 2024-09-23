class Solution {
    public boolean isBalanced(TreeNode root) {
        // A helper function to get both the height and the balance status
        return checkBalance(root) != -1;
    }
    
    // This function returns the height of the tree if balanced, or -1 if unbalanced
    private int checkBalance(TreeNode root) {
        if (root == null) {
            return 0; // Height of an empty tree is 0
        }
        
        // Recursively get the height of the left and right subtrees
        int leftHeight = checkBalance(root.left);
        if (leftHeight == -1) return -1; // Left subtree is unbalanced
        
        int rightHeight = checkBalance(root.right);
        if (rightHeight == -1) return -1; // Right subtree is unbalanced
        
        // If the difference in height is greater than 1, it's unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        
        // Return the height of the current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
