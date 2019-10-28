package javatest;

import java.util.Arrays;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-23
 */
public class HeapSortTest {

    public static void dump(int[] array, int parentIndex, int length) {
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && array[childIndex] < array[childIndex + 1]) {
                childIndex++;
            }
            if (temp >= array[childIndex]) {
                return;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;

    }

    public static void headSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            dump(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        headSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
