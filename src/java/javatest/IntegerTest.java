package javatest;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-19
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 100;
        change(a, b);
        System.out.println(a + ":" + b);

    }

    public static void change(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }
}
