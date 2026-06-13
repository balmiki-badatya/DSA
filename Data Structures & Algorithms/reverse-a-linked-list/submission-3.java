/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * } 1 -> 2 -> 3 -> 4 -> 5
 */

class Solution {
    private ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            // newHead = head;
            return head;

        }
        newHead = reverseList(head.next);
        head.next.next=head;
        head.next = null;
        return newHead;
    }
}
