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
    public ListNode reverseList(ListNode head) {
        ListNode curr = null;
        ListNode prev = null;
        ListNode next = null;

        while(head != null){
            curr = head;
            next = curr.next;

            curr.next = prev;
            head = next;

            prev = curr;
        }
        return curr;
    }
}
