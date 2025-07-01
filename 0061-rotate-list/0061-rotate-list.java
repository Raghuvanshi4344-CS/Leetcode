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
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode s=head;
        ListNode f=head;
        ListNode temp=head;
        int count=1;
        for(int i=0;temp.next!=null;i++){
            count++;
            temp=temp.next;
        }
        k=k%count;
        
        for(int i=0;i<k;i++){
            f=f.next;
        }
        
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        f.next=head;
        head=s.next;
        s.next=null;
        return head;
    }
}