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
    static boolean ans;
    public boolean isBalanced(TreeNode root) {
        ans = true;
        int res = func(root);
        return ans;
    }
    static int func(TreeNode root)
    {
        if(root == null) return 0;
        int lh = func(root.left);
        int rh = func(root.right);
        if(Math.abs(lh-rh) > 1) ans = false;
        return 1+Math.max(lh,rh);
    }
}
