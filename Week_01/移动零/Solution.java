class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, f = 0;
        while (nums.length != 1 && f <= nums.length - 1) {
            if (nums[f] == 0) {
                f++;
                continue;
            }
            if (nums[l] == 0) {
                nums[l] = nums[f];
                nums[f] = 0;
                l++;
                continue;
            }
            f++;
            l++;
        }
    }
}