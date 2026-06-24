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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int x=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            x++;
        }
        if(n==x) return head.next;
        x=x-n-1;
        temp=head;
        int ch=0;
        while(temp!=null){
            if(x==ch){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            ch++;
        }
        return head;
    }
}