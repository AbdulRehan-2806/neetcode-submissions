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
    public void reorderList(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = slow.next;
        slow.next = null;
        newhead = reverse(newhead);
        ListNode h1 = head;
        while (newhead != null) {
            ListNode next1 = h1.next;
            ListNode next2 = newhead.next;

            h1.next = newhead;
            newhead.next = next1;

            h1 = next1;
            newhead = next2;
        }

    }
    static ListNode reverse(ListNode head)
    {
        ListNode prev = null , cur = head;
        while(cur != null)
        {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
