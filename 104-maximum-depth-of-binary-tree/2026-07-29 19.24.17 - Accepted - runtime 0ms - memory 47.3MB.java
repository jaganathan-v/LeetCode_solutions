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
    public static int height(TreeNode root){
        if(root == null) return -1;
        int lheight =height(root.left);
        int rheight = height(root.right);

        return Math.max(lheight,rheight)+1;
    }
    public int maxDepth(TreeNode root) {
      if(root == null){ 
        return 0;
      }
        // Queue<TreeNode> q= new LinkedList<>();

        // q.offer(root);
        // int depth=0;
        // while(!q.isEmpty()){
        //     int levelSize = q.size();
           
            
        //     for(int i=0;i<levelSize;i++){
        //         TreeNode curr = q.poll();
        //     if(curr.left != null) q.offer(curr.left);
        //     if(curr.right != null) q.offer(curr.right);
        //     }
        //     depth++;
        // }
        // return depth;
   int value = height(root);
   return value+1;
    }
}