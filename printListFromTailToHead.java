/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode ret = reverseList(listNode);
        while(ret!=null){
            arr.add(ret.val);
            ret = ret.next;
        }
        return arr;
    }
    private ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        ListNode newHead = null;
        while(cur!=null){
            ListNode curNext = cur.next;
            if(curNext==null){
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }
}