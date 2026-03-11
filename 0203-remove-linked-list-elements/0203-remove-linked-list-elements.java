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
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         if(head==null) return head;
//         while(head != null && head.val == val) {
//             head = head.next;
//         }
//         ListNode temp=head;
//         while(temp!=null && temp.next!=null){
//             if(temp.next.val==val){
//                 temp.next=temp.next.next;
//             }
//             else {
//                 temp=temp.next;
//             }
//         }
//         return head;
//     }
// }

class Solution {
    ListNode new fin;
    public void add(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
        ListNode new fin;
        while(head!=null){
            if(head.val!=val){
                fin.add(val)
            }
            head=head.next;
        }
    }
}