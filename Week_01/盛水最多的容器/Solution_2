class Solution {
    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length - 1;
        int max = 0;
        while (head != tail) {
            int temp = (tail - head) * min(height[tail], height[head]);
            if (height[tail] > height[head]) {
                head++;
            } else {
                tail--;
            }
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
    private static int min(int a, int b) {
        return a <= b ? a : b;
    }
}