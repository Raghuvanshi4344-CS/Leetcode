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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        ListNode temp=head;
        while(temp!=null){
            ListNode te=temp.next;
            temp.next=dummy.next;
            dummy.next=temp;
            temp=te;
        }
        return dummy.next;
    }
}