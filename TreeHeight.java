/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
         if(root==null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return leftHeight>=rightHeight?leftHeight+1:rightHeight+1;
    }
}