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
// 3 -> 2 -> 1 prev = null , cur = 3
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode newhead = reverse(head);
        int cur = 1;
        ListNode prev = null;
        ListNode h1 = newhead;
        while(cur != n)
        {
            prev = h1;
            h1 = h1.next;
            cur++;
        }
        if(prev == null){
            h1 = h1.next;
            return reverse(h1);
        }
        prev.next = h1.next;
        newhead = reverse(newhead);
        return newhead;
    }
    static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
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
