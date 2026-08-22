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
    public boolean isSameTree(TreeNode p, TreeNode q) {
     Queue<TreeNode> q1 = new LinkedList<>();
     Queue<TreeNode> q2 = new LinkedList<>();
     if(p==null && q == null){ 
        return true;
     }
     if(p==null || q == null){ 
        return false;
     }
     if(p.val != q.val){
        return false;
     }
     q1.offer(p);
     q2.offer(q);
     if(q1.size() != q2.size()){ 
        return false;
     }
    while(!q1.isEmpty() || !q2.isEmpty()){ 
       int size = q1.size();
    for(int i=0;i<size;i++){ 
        TreeNode temp1 = q1.poll();
       TreeNode temp2 = q2.poll();
       if(temp1.val != temp2.val) return false;

       if((temp1.left != null)&&(temp2.left != null)){
            if(temp1.left.val != temp2.left.val) return false;
            q1.offer(temp1.left);
            q2.offer(temp2.left);
       }else if((temp1.left != null)||(temp2.left != null)){
            return false;
       }
        if((temp1.right!= null)&&(temp2.right != null)){
            if(temp1.right.val != temp2.right.val) return false;
            q1.offer(temp1.right);
            q2.offer(temp2.right);
       } else if((temp1.right!= null)||(temp2.right != null)){
                  return false;
       }
       }
     }
     return true;
    }
}