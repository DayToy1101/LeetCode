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
    List<Integer> l = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        TreeNode node = new TreeNode(-1);
        TreeNode cur = node;
        for(int i = 0;i < l.size();i++){
            cur.right = new TreeNode(l.get(i));
            cur = cur.right;
        }
        return node.right;
    }
    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        l.add(root.val);
        inOrder(root.right);
    }
}