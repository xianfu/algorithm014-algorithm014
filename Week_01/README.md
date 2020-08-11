### 学习笔记
2020/08/10

> 今天是学习正式课程的第一天。
> 个人觉得自己先做题，再带着问题看老师的讲解视频这样效果更好。
 
- 盛水最多的容器 
``` text
Solution_1 是最开始想到的解决方法，无脑的双重for循环。
Solution_2 是学习了题解中的思路，双指针的一种概念。
相比起来，内存消耗差不多，但是运行时间相差很多，由1023ms 提升为 3ms
原因是Solution_1的时间复杂度很高，O(N2)，Solution_2 只要O(n)
```

- 移动零

> 我的第一个版本，结果是执行时间超时

```java
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
            }
        }
    }
}
```

> 研究了一下leecode的用例,原来是临界值的问题。
> 兼容了一下,运行时间1ms感觉还不错。
> 看了覃超老师的视频后，觉得自己的方法还是有点low。

```java
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
```