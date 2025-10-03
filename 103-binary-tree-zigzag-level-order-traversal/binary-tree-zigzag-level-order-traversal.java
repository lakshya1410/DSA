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
    public  void nthlevel(TreeNode root, int n,List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            
        }
        nthlevel(root.left, n-1,arr);
        nthlevel(root.right, n-1,arr);
    }
public  void nthlevel2(TreeNode root, int n,List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            
        }
        nthlevel2(root.right, n-1,arr);
        nthlevel2(root.left, n-1,arr);
    }
       public  int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root)+1;
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        for(int i=1;i<=level;i++){
            List<Integer> arr= new ArrayList<>();
            if(i%2!=0) nthlevel(root,i,arr);
            else nthlevel2(root,i,arr) ;
            ans.add(arr);
        }
        return ans;
    }
}