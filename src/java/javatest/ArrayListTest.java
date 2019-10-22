package javatest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-20
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.remove(1);
        /**
         *     public E remove(int index) {
         *         rangeCheck(index);
         *
         *         modCount++;
         *         E oldValue = elementData(index);
         *
         *         int numMoved = size - index - 1;
         *         if (numMoved > 0)
         *             System.arraycopy(elementData, index+1, elementData, index,
         *                              numMoved);
         *         elementData[--size] = null; // clear to let GC do its work
         *
         *         return oldValue;
         *     }
         */
    }
}
