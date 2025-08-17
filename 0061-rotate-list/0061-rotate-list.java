class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        // find the length
        ListNode curr = head;
        int len = 1;
        while(curr.next != null) {
            curr = curr.next;
            len++;
        }

        // make it circular
        curr.next = head;

        // effective k
        k = k % len;
        int stepToHead = len - k; 

        ListNode prev = curr; // curr is currently the tail

        // move prev to the node just before new head
        while(stepToHead-- > 0) {
            prev = prev.next;
        }

        // new head is next of prev
        head = prev.next;
        prev.next = null;

        return head;
    }
}
