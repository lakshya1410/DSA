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
    public List<Integer> rightSideView(TreeNode root) {
           ArrayList<Integer> ans= new ArrayList<>();
        left(root,ans,0);
        return ans;
    }
    void left(TreeNode root,ArrayList<Integer> ans,int level){
        if(root==null) return;
        if(level==ans.size()){
            ans.add(root.val);
        }
        
        left(root.right,ans,level+1);
        left(root.left,ans,level+1);
    }
    
}