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
    public static int depth(TreeNode root){
        if(root == null ) return 0;
        if(root.left == null && root.right == null) return 1;
        int count = 0;
        int small = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
          int size = q.size();
          while(size != 0){
            TreeNode temp = q.poll();
            if(temp.left != null)  q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
            if(temp.left == null && temp.right == null){
              return count+1;
            } 
            size--;
          }
          count++;
        }
      return count;
    }
    public int minDepth(TreeNode root) {
    int value = depth(root);
    return value;
    }
}