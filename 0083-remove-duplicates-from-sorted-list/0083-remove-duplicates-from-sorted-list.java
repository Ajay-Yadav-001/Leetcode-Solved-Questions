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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode D = new ListNode(head.val);
        ListNode tail = D;
        head = head.next;
        while (head != null) {
            if (tail.val != head.val) {
                tail.next = new ListNode(head.val);
                tail = tail.next;
            }
            head = head.next;
        }
        return D;
    }
}