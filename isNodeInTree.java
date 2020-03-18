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
    //检测一个节点是否在树中
    private boolean isNodeInTree(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        if(isNodeInTree(root.left,node)||isNodeInTree(root.right,node)){
            return true;
        }
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==null||q==null){
            return null;
        }
        //如果有一个节点在根的位置，最近公共祖先一定是根节点
        if(root==p||root==q){
            return root;
        }
        //检测p和q在子树中的情况
        boolean isPInLeft = false;
        boolean isPInRight = false;
        boolean isQInLeft = false;
        boolean isQInRight = false;
        //检测p是否在左子树里面
        if(isNodeInTree(root.left,p)){
            isPInLeft = true;
            isPInRight=false;
        }else{
            isPInRight = true;
            isPInLeft = false;
        }
        //检测q是否在左子树里面
        if(isNodeInTree(root.left,q)){
            isQInLeft = true;
            isQInRight = false;
        }else{
            isQInRight = true;
            isQInLeft = false;
        }
        //p和q分别在root的左右子树中
        if((isPInLeft&&isQInRight)||(isPInRight&&isQInLeft)){
            return root;
        }else if(isPInLeft&&isQInLeft){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return lowestCommonAncestor(root.right,p,q);
        }
    }
}