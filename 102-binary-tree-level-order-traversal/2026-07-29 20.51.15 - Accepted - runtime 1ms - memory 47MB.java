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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null){ 
            return ll;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
        List<Integer> ls = new ArrayList<>();
        int levelsize = q.size();
            for(int i=0;i<levelsize;i++){
                TreeNode curr = q.poll();
                ls.add(curr.val);
             if(curr.left !=null) q.offer(curr.left);
             if(curr.right !=null) q.offer(curr.right);
            }
            ll.add(ls);
        }
        return ll; 
    }
}