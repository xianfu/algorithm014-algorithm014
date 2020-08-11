class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, f = 0;
        // 思路很简单，快慢指针 l : slow, f : fast 。
        while (nums.length != 1 && f <= nums.length - 1) {
            // 如果f位置为0，则让 f 先走，找到一个非零的位置
            if (nums[f] == 0) {
                f++;
                continue;
            }
            // 如果l位置为0，则跟f位置的值互换
            if (nums[l] == 0) {
                nums[l] = nums[f];
                nums[f] = 0;
                l++;
                continue;
            }
            // 都不为0则一起往前移动
            f++;
            l++;
        }
    }
}