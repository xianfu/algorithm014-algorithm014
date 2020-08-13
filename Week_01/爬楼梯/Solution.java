/**
 * 暴力版本，没有使用缓存
 */
class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

/**
 * 使用缓存的版本
 */
class Solution {

    public int climbStairs(int n) {
        int[] tempN = new int[n];
        return help(n, tempN);
    }

    private static int help(int n, int[] tempN) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return getTemp(n - 1, tempN) + getTemp(n - 2, tempN);
    }

    private static int getTemp(int n, int[] tempN) {
        if (tempN[n] == 0) {
            int temp = help(n, tempN);
            tempN[n] = temp;
            return temp;
        } else {
            return tempN[n];
        }
    }
}