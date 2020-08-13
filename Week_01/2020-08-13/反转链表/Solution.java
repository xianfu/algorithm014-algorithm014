/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currentNode = head;
        // 链表被打断，需要暂存后一段链表的头
        ListNode tmpBreadHead = null;
        while(currentNode!=null) {
            tmpBreadHead = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = tmpBreadHead;
        }
        return preNode;
    }
}