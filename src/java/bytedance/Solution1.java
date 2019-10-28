package bytedance;

import java.util.Arrays;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-17
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                if (Math.abs(temp - target) < Math.abs(closeNum - target)) {
                    closeNum = temp;
                }
                if (temp < target) {
                    j++;
                } else if (temp > target) {
                    k--;
                } else {
                    return temp;
                }
            }
        }
        return closeNum;
    }
}
