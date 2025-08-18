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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        int count=0;
        ListNode curr=head;
        while(curr!=null&&count!=k){
            curr=curr.next;
            count++;
        }
        if(count==k){
            curr=reverseKGroup(curr,k);

            while(count-->0){
                ListNode temp = head.next;
                head.next=curr;
                curr=head;
                head=temp;
            }
            head=curr;
        }
        return head;
        
    }
}