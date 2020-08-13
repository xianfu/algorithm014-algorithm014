/**
 * 暴力
 */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        // 双重for循环，将所有的可能都计算出来
        // 时间复杂度O(N的平方)
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int water = min(height[i], height[j]) * abs(i, j);
                if (water >= max) {
                    max = water;
                }
            }
        }
        return max;
    }

    /**
     * 获取两个数中的最小一个
     * @param a
     * @param b
     * @return
     */
    private static int min(int a, int b) {
        return a <= b ? a : b;
    }

    /**
     * 获取两个数相减的绝对值
     * @param a
     * @param b
     * @return
     */
    private static int abs(int a, int b) {
        return a - b >= 0 ? a - b : b - a;
    }
}


/**
 * 双指针
 */
class Solution {
    public int maxArea(int[] height) {
        // 定义 头指针
        int head = 0;
        // 定义 尾指针
        int tail = height.length - 1;
        // 存储最大值
        int max = 0;
        while (head != tail) {
            // 计算当前指针位置所盛水的数量
            int temp = (tail - head) * min(height[tail], height[head]);
            // 找出较矮的一端，并向中间移动指针
            if (height[tail] > height[head]) {
                head++;
            } else {
                tail--;
            }
            // 如果当前temp值大于历史最大值，则更新max
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    /**
     * 获取两个数中的最小一个
     * @param a
     * @param b
     * @return
     */
    private static int min(int a, int b) {
        return a <= b ? a : b;
    }
}