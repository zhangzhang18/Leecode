package bank;

import java.util.Arrays;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-17
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum1(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = null;
        if (nums != null) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                int j = nums.length - 1;
                while (j > i) {
                    int temp = nums[i] + nums[j];
                    if (temp == target) {
                        index = new int[]{i + 1, j};
                        break;
                    } else if (temp > target) {
                        j--;
                    } else {
                        break;
                    }
                }
            }
        }
        return index;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] index = null;
        if (nums != null) {
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i + 1; j < nums.length ; j++) {
                    int temp = nums[i] + nums[j];
                    if (temp == target) {
                        index = new int[]{i, j};
                        break;
                    }
                }
            }
        }
        return index;
    }
}
