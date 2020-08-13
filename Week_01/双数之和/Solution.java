/**
 * 暴力
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int slow = 0, fast = 0;
        while (slow < nums.length ) {
            if (slow != fast && nums[slow] + nums[fast] == target ) {
                return new int[]{slow, fast};
            }
            if (fast != nums.length - 1) {
                fast++;
            } else {
                slow++;
                fast = 0;
            }
        }
        return new int[]{};
    }
}

/**
 * hash * 2
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer res = numsMap.get(target - nums[i]);
            if (res != null && i != res) {
                return i > res ? new int[]{res, i} : new int[]{i, res};
            }
        }
        return new int[]{};
    }
}

/**
 * hash * 1
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer res = numsMap.get(target - nums[i]);
            if (res != null && i != res) {
                return i > res ? new int[]{res, i} : new int[]{i, res};
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}