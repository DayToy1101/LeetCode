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
    //获取节点的路径
    private boolean getNodePath(TreeNode root,TreeNode node,Stack<TreeNode> sPath){
        if(root==null){
            return false;
        }
        sPath.push(root);
        if(root==node){
            return true;
        }
        //递归到root的左子树||右子树中找node接点的路径
        if(getNodePath(root.left,node,sPath)||getNodePath(root.right,node,sPath)){
            return true;
        }
        sPath.pop();
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==null||q==null){
            return null;
        }
        //获取p和q的路径
        Stack<TreeNode> pPath = new Stack<>();
        Stack<TreeNode> qPath = new Stack<>();
        if(getNodePath(root,p,pPath) && getNodePath(root,q,qPath)){
        //两个路径对应的栈：
        //1、让节点个数多的栈里元素先出栈直到栈内节点个数相同
        //2、依次比较栈顶元素，直到第一个相同的节点就为这两个节点最近的公共祖先
            int sizep = pPath.size();
            int sizeq = qPath.size();
            while(sizep!=0 && sizeq!=0){
                if(sizep>sizeq){
                    pPath.pop();
                    sizep--;
                }else if(sizep<sizeq){
                    qPath.pop();
                    sizeq--;
                }else{
                    if(pPath.peek()==qPath.peek()){
                        return pPath.peek();
                    }else{
                        pPath.pop();
                        qPath.pop();
                        sizep--;
                        sizeq--;
                    }
                }
            }
        }
        return null;
    }
}