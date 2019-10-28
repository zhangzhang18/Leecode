package interview.list;

import java.util.Arrays;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-23
 */
public class HeapSort {
    //https://blog.csdn.net/u010452388/article/details/81283998
    public static void dump(int[] array, int parentIndex, int length) {

        // temp保存父节点值，用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex] < array[childIndex + 1]) {
                childIndex++;
            }
            // 如果父节点小于任何一个孩子的值，直接跳出
            if (temp >= array[childIndex]) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;

    }

    public static void headSort(int[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            dump(array, i, array.length);
        }
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

    public static void heapInsert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentIndex = i;
            int fatherIndex = (currentIndex - 1) / 2;
            //如果当前插入的值大于其父结点的值,则交换值，并且将索引指向父结点
            while (arr[currentIndex] > arr[fatherIndex]) {
                swap(arr, currentIndex, fatherIndex);
                currentIndex = fatherIndex;
                fatherIndex = (currentIndex - 1) / 2;
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
