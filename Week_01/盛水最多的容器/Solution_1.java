class Solution {
    public int maxArea(int[] height) {
        int max = 0;
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
    private static int min(int a, int b) {
        return a <= b ? a : b;
    }
    private static int abs(int a, int b) {
        return a - b >= 0 ? a - b : b - a;
    }
}