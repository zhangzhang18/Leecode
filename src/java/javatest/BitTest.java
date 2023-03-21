package javatest;

/**
 * @author zhangchunmeng <zhangchunmeng@kuaishou.com>
 * Created on 2023/2/9
 */
public class BitTest {
    public static void main(String[] args) {
        System.out.println("1 << 1 =" + (1 << 1));// 0 0 0 1
        System.out.println("1 << 2 =" + (1 << 2));// 0 0 1 0
        System.out.println("1 << 3 =" + (1 << 3));// 0 1 0 0
        System.out.println("2 | 4 =" + (2 | 4)); // 0 0 1 1 =6
        System.out.println("2 | 8 =" + (2 | 8)); // 0 1 0 1 =10
        // 0 0 1 1
        System.out.println("4 & 6 =" + (4 & 6));
        System.out.println("4 & 6 =" + (4 & 6));


    }
}

