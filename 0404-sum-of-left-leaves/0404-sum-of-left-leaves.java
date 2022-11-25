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
    public int sumOfLeftLeavesHelper(TreeNode root,boolean isLeft) {
        if(root==null)
            return 0;
      //if(node is left node)  
        if(root.left==null && root.right==null && isLeft==true)
         return root.val;
      //else return sum of left nodes  
        return sumOfLeftLeavesHelper(root.left,true)+sumOfLeftLeavesHelper(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeavesHelper(root,false); 
    }
}