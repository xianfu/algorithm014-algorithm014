/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode next = node.next;
        node.next = swapPairs(next.next);
        next.next = node;
        return next;
    }
}