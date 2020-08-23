class Solution {
    public List<Integer> preorder(Node root) {
        Stack<Node> nodeStack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        // 空判断
        if (root == null) return list;

        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            Node popNode = nodeStack.pop();
            list.add(popNode.val);
            if (popNode.children != null && popNode.children.size() != 0) {
                // 这里是重点 ， 倒叙 放进 栈 中
                for(int i = popNode.children.size() - 1; i >= 0; i--) {
                    nodeStack.push(popNode.children.get(i));
                }
            }
        }
        return list;
    }
}