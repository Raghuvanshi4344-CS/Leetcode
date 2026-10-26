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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode a=head;
        while(a!=null && a.next!=null){
            int temp=a.next.val;
            a.next.val=a.val;
            a.val=temp;
            a=a.next.next;
        }
        return head;
    }
}