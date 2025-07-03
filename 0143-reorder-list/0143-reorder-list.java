/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return ;
        }
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode a=null;
        ListNode b=s.next;
        s.next=null;
        while(b!=null){
            ListNode temp=b.next;
            b.next=a;
            a=b;
            b=temp;
        }
        ListNode x=head;
        ListNode y=a;
        while(y!=null){
            ListNode tem1=x.next;
            ListNode tem2=y.next;
            x.next=y;
            y.next=tem1;
            x=tem1;
            y=tem2;
        }
    }
}