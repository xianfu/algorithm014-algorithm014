class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            // 因为是排序过的数组，如果k都大于0了，那么后面正数相加都是大于0的了
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            // 当前k和下一个数字相同，则跳过
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum > 0) {
                    // 使用do...while 是为了跳过重复值
                    do {
                        j--;
                    } while (i < j && nums[j] == nums[j + 1]);
                    // 别人的写法
                    // while(i < j && nums[j] == nums[--j]);
                } else if (sum < 0) {
                    do {
                        i++;
                    } while (i < j && nums[i] == nums[i - 1]);
                } else {
                    results.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    do {
                        j--;
                    } while (i < j && nums[j] == nums[j + 1]);
                    do {
                        i++;
                    } while (i < j && nums[i] == nums[i - 1]);
                }
            }
        }
        return results;
    }
}