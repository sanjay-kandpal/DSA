/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void ModifyTree(TreeNode root,int val,int depth,int c){
        if(root == null){
            return ;
        }
        
        if(c == depth-1){
            TreeNode newLeft = new TreeNode(val);
            newLeft.left = root.left;
            root.left = newLeft;

            TreeNode newRight = new TreeNode(val);
            newRight.right = root.right;
            root.right = newRight;
            return ;
        }
        ModifyTree(root.left,val,depth,c+1);
        ModifyTree(root.right,val,depth,c+1);
        
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode newRoot = null;
        if(depth ==  1){
            newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        ModifyTree(root,val,depth,1);
        return root;
    }
}