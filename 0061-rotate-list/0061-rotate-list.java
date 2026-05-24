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
        if(head==null || head.next==null || k==0) return  head;
        ListNode s=head;
        ListNode f=head;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        k=k%c;
        for(int i=0;i<k;i++){
            f=f.next;
        }
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next;
        }
        f.next=head;
        head=s.next;
        s.next=null;
        return head;
    }
}