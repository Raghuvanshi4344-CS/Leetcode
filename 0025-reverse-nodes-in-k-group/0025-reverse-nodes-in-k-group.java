class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to handle head changes easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy, nex = dummy, pre = dummy;

        // Count total nodes in the list
        int count = 0;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Iterate while there are at least k nodes remaining
        while (count >= k) {
            curr = pre.next; // The first node of the group
            nex = curr.next; // The node after curr

            for (int i = 1; i < k; i++) {
                curr.next = nex.next; // Remove nex from its position
                nex.next = pre.next;  // Insert nex before curr
                pre.next = nex;       // Connect pre to nex (new head of reversed part)
                nex = curr.next;      // Move nex to next node to process
            }
            pre = curr; // Move pre to the tail of the reversed group
            count=count- k;
        }

        return dummy.next;
    }
}
