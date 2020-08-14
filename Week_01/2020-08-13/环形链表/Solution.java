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
 * hash 法
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new LinkedHashSet<>();
        while (head != null) {
            if (nodeSet.contains(head)) {
                return true;
            } else {
                nodeSet.add(head);
                head = head.next;
            }
        }
        return false;
    }
}