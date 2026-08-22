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
    public static void traverse(TreeNode root,List<Double> list){
     if(root == null) return;
     Queue<TreeNode> q = new LinkedList<>();
     q.offer(root);
     int i;
     while(!q.isEmpty()){
        int size = q.size();
        long sum = 0;
        for( i=0;i<size;i++){
            TreeNode temp = q.poll();
            sum+=temp.val;
            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
        }
        list.add((double)sum/i);
     }
    }
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> list = new ArrayList<>();
    traverse(root,list);
    return list;
    }
}