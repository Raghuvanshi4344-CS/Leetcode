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
        ListNode tem=head;
        int c=0;
        while(tem!=null){
            c++;
            tem=tem.next;
        }
        k=k%c;
        while(k>0){
            ListNode tr=head;
            while(tr!=null && tr.next.next!=null){
                tr=tr.next;
            }
            ListNode temp=tr.next;
            tr.next=null;
            temp.next=head;
            head=temp;
            k--;
        }
        return head;
    }
}