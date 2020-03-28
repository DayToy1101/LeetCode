import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){
            return (new ArrayList<>());
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            arr.add(cur.val);
            if(cur.left!=null){
                q.offer(cur.left);
            }
            if(cur.right!=null){
                q.offer(cur.right);
            }
        }
        return arr;
    }
}