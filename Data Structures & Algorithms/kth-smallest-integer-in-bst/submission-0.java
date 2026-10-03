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
    static PriorityQueue<Integer> pq;
    public int kthSmallest(TreeNode root, int k) {
        pq = new PriorityQueue<>();
        func(root);
        int i=1;
        while(i<k){
            pq.poll();
            i++;
        }
        return pq.peek();
    }
    static void func(TreeNode root)
    {
        if(root == null) return ;
        func(root.left);
        pq.offer(root.val);
        func(root.right);
    }
}
