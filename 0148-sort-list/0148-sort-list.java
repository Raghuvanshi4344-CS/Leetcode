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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        List <Integer> val=new ArrayList<>();
        while(temp!=null){
            val.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(val);
        temp=head;
        for(int va: val){
            temp.val=va;
            temp=temp.next;
        }
        return head;
    }
}