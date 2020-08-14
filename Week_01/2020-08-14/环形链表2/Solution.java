/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new ha<>();

        while (true) {
            if (nodeSet.contains(head)) {
                return head;
            }
            if(head == null) {
                return null;
            }
            nodeSet.add(head);
            head = head.next;
        }
    }
}