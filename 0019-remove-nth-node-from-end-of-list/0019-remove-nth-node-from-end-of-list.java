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
        ListNode temp=head;
        int x=0;
        while(temp!=null){
            temp=temp.next;
            x++;
        }
        n=x-n;
        ListNode dummy=new ListNode(0);
        temp=dummy;
        while(head!=null){
            if(n==0){
                head = head.next;
                n--;
                continue;
            }
            temp.next = new ListNode(head.val);
            temp=temp.next;
            head=head.next;
            n--;
        }
        return dummy.next;
    }
}