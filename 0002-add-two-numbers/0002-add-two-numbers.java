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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        int carry=0;
        while(l1!=null || l2!=null ||carry!=0){
            int s=0;
            if(l1!=null){
                s=s+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s=s+l2.val;
                l2=l2.next;
            }
            s=s+carry;
            ListNode x=new ListNode(s%10);
            carry=s/10;
            temp.next=x;
            temp=temp.next;
        }
        head=head.next;
        return head;
    }
}