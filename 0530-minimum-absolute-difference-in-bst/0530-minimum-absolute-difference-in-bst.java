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
    int minValue;
    int preValue;
    boolean init;
    public int getMinimumDifference(TreeNode root) {
        init = false;
        minValue = Integer.MAX_VALUE;
        inorder(root);
        return minValue;
    }

    public void inorder(TreeNode now){
        if(now== null) return;
        inorder(now.left);
        if(!init){
            init = true;
        }else{
            minValue = Math.min(minValue, Math.abs(preValue - now.val));
        }
        preValue = now.val;
        inorder(now.right);
    }
}