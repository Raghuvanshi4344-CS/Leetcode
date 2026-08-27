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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode tem=head,f=head,s=head;
        int c=0;
        while(tem!=null){
            c++;
            tem=tem.next;
        }
        k=k%c;
        while(k>0){
            f=f.next;
            k--;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        f.next=head;
        head=s.next;
        s.next=null;
        return head;
    }
}