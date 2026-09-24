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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode ptr1 = l1 , ptr2 = l2;
        int carry = 0;
        while(ptr1!=null && ptr2 != null)
        {
            int sum = ptr1.val + ptr2.val;
            if(carry == 1){
                sum += 1;
                carry = 0;
            }
            if(sum > 9)
            {
                carry = 1;
                sum = sum %10;
            }
            ListNode node = new ListNode(sum);
            head.next = node;
            head = node;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        while(ptr1 != null)
        {
            int sum = ptr1.val;
            if(carry == 1){
                sum += 1;
                carry = 0;
            }
            if(sum > 9)
            {
                carry = 1;
                sum = sum %10;
            }
            ListNode node = new ListNode(sum);
            head.next = node;
            head= node;
            ptr1 = ptr1.next;
        }
        while(ptr2 != null)
        {
            int sum = ptr2.val;
            if(carry == 1){
                sum += 1;
                carry = 0;
            }
            if(sum > 9)
            {
                carry = 1;
                sum = sum %10;
            }
            ListNode node = new ListNode(sum);
            head.next = node;
            head= node;
            ptr2 = ptr2.next;
        }
        if(carry == 1)
        {
            ListNode node = new ListNode(carry);
            head.next = node;
            head = node;
        }
        return dummy.next;
        
    }
}
