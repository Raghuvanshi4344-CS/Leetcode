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
    ListNode fin;
    public void addf(int data){
        ListNode newNode=new ListNode(data);
        if(fin==null) {
            fin=newNode;
            return;
        }
        ListNode temp=fin;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
        fin=null;
        while(head!=null){
            if(head.val!=val){
                addf(head.val);
            }
            head=head.next;
        }
        return fin;
    }
}