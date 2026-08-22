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
    public TreeNode invertTree(TreeNode root) {
    if(root == null)  return root;
    Queue<TreeNode> q = new LinkedList<>();
    // if(root.left == null) return root;
    // if(root.right == null) return root;
    q.offer(root);


    while(!q.isEmpty()){
        int size = q.size();

        for(int i=0;i<size;i++){ 
            TreeNode temp1 = q.poll();
            TreeNode left = temp1.right;
            temp1.right = temp1.left;
            temp1.left = left;
            if(temp1.left != null) q.offer(temp1.left);
            if(temp1.right != null) q.offer(temp1.right);;
        }
    }
    return root;
    }
}