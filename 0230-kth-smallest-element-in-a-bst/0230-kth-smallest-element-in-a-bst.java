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
    static int count;
    static int answer;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return answer;
    }

    public void inorder(TreeNode now){
        if(now == null) return;
        inorder(now.left);
        count--;
        if(count==0) {
            answer =  now.val;
            return;
        }
        inorder(now.right);
    }
}