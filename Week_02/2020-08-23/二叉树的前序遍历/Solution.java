/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // 空判断
        if (root == null) {
            return list;
        }
        helper(list, root);
        return list;
    }

    private void helper(List<Integer> list, TreeNode root) {
        if(root == null) {
            return;
        }

        list.add(root.val);

        if(root.left != null) {
            helper(list, root.left);
        }
        if(root.right != null) {
            helper(list, root.right);
        }
    }
}