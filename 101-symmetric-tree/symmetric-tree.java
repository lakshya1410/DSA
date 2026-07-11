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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return help(root.left,root.right);
    }
    boolean help(TreeNode leftroot,TreeNode rightroot){
        if(leftroot==null && rightroot==null) return true;
        if(leftroot==null || rightroot==null) return false;
        if(leftroot.val!=rightroot.val) return false;
        return help(leftroot.left,rightroot.right) && help(leftroot.right,rightroot.left);

    }
}