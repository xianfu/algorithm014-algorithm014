### 学习笔记

做题 四件套：
1、clarification 跟面试官一起明确题目的意思

2、possible solution 
    -> optimal(time & space) 从众多解题思路中找到一个最优的，从空间时间复杂度上来

3、code 写代码

4、test cases 测试样例


二叉树的前序中序后序遍历：
```java
private void helper(List<Integer> list, TreeNode root) {
        if(root == null) {
            return;
        }
        // 左
        if(root.left != null) {
            helper(list, root.left);
        }
        // 中
        list.add(root.val);
        // 右
        if(root.right != null) {
            helper(list, root.right);
        }
    }
```
递归核心代码调整 根左右， 左根右， 左右跟 即可。

学习了java中的堆的应用：Priority Queue
默认为 小顶堆
通过传入自定义的比较器，可以实现大顶堆。（最小的K个数）

