
import java.util.Scanner;

class BTNode{
    BTNode left = null;
    BTNode right = null;
    char val;
    public BTNode (char val){
        this.val = val;
    }
}
class BinTree{
    private BTNode root = null;
    int index = 0;
    public BinTree(String s,char invalid){
        root = createTree(s,invalid);
    }
    private BTNode createTree(String s,char invalid){
        BTNode newRoot = null;
        if(index<s.length()&&s.charAt(index)!=invalid){
            newRoot = new BTNode(s.charAt(index));
            ++index;
            newRoot.left = createTree(s,invalid);
            ++index;
            newRoot.right = createTree(s,invalid);
        }
        return newRoot;
    }
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(BTNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            BinTree bt = new BinTree(s,'#');
            bt.inOrder();
        }
    }
}