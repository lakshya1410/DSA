/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        if(root==null) return "";
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if (node == null) {
                    str.append("N,");
                    continue;
                }
                str.append(node.val).append(",");
               q.offer(node.left);
        q.offer(node.right);
            }
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.length()==0) return null;

        String[] val =data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(val[0]));
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(!val[i].equals("N")){
                node.left=new TreeNode(Integer.parseInt(val[i]));
                q.offer(node.left);
            }
            i++;
            if(!val[i].equals("N")){
                node.right=new TreeNode(Integer.parseInt(val[i]));
                q.offer(node.right);

            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));