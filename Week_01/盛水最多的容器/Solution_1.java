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