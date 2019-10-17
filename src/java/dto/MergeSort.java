package dto;

import java.util.Optional;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-10
 */
public class MergeSort {
    public static void main(String[] args) {

    }


    void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            //折半成两个小集合，分别进行递归
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            //把有序小集合，归并成大集合
            merge(arr, start, mid, end);
        }
    }

    void merge(int[] arr, int start, int mid, int end) {
        //开辟额外大集合
        int[] temp = new int[end - start + 1];
        int p1 = start, p2 = mid + 1, p = 0;
        //比较两个小集合放入大集合
        while (p1 < mid && p2 < end) {
            if (arr[p1] <= arr[p2]) {
                temp[p++] = arr[p1++];
            } else {
                temp[p++] = arr[p2++];
            }
        }
        //左侧有剩余
        while (p1 < mid) {
            temp[p++] = arr[p1++];
        }
        //右侧有剩余
        while (p2 < end) {
            temp[p++] = arr[p2++];
        }
        //复制回原数组
        for (int i = 0; i < temp.length; i++) {
            arr[i + start] = temp[i];
        }
    }
}
