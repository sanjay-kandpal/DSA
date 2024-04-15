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
    int sum ;
    public  void helperSum(TreeNode root,int sum2){
        
        if(root == null){
            return;
        }
        
        sum2 =sum2 * 10 + root.val;
        if(root.left == null && root.right == null){
            sum += sum2;
            return;
        }
        helperSum(root.left,sum2);
        helperSum(root.right,sum2);
        
    }
    public int sumNumbers(TreeNode root) {
        sum =0;
        helperSum(root,0);
        return sum ;
    }
}