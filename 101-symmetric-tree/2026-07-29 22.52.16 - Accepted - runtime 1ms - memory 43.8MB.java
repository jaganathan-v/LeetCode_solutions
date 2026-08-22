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
    Queue<TreeNode> q =new LinkedList<>();
    Queue<TreeNode> q1 =new LinkedList<>();
    if (root == null)
    return true;
    
    q.offer(root.left);
    q1.offer(root.right);
    while(!q.isEmpty() && !q1.isEmpty()){ 
        int size = q.size();
        for(int i=0;i<size;i++){ 
            TreeNode temp1 = q.poll();
            TreeNode temp2 = q1.poll();
            if (temp1 == null && temp2 == null)
               continue;

            if (temp1 == null || temp2 == null)
                 return false;
            if(temp1.val != temp2.val) return false;
            if(temp1.left != null && temp2.right != null){
                
                if(temp1.left.val != temp2.right.val) return false;
                q.offer(temp1.left);
                q1.offer(temp2.right);
            }else if(temp1.left != null || temp2.right != null){
                return false;
            }
           
           if(temp1.right != null && temp2.left != null){
            if(temp1.right.val != temp2.left.val) return false;
             q.offer(temp1.right);
             q1.offer(temp2.left);
           }else if(temp1.right != null || temp2.left != null){
             return false;
           }
        }
    }
    return true; 
    }
}