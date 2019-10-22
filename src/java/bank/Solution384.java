package bank;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-17
 */
public class Solution384 {
    private int[] array;
    private int[] original;
    Random rand = new Random();

    public Solution384(int[] nums) {
        this.original = nums;
        this.array = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int size = array.length;
        // Shuffle array
        for (int i = size; i > 1; i--) {
            swap(array, i - 1, rand.nextInt(i));
        }
        return array;
    }


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
