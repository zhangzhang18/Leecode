package bank;

import java.util.Arrays;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-22
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            result[k++] = nums1[i] > nums2[j] ? nums1[i++] : nums1[j++];
        }
        if (i < m)
            System.arraycopy(result, i, nums1, i + j, m + n - i - j);
        if (j < n)
            System.arraycopy(nums2, j, nums1, i + j, m + n - i - j);
    }

}
