package dto;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-16
 */
public class Stack {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("length:" + i);
            System.out.println(maxCuttingSolution(i));
        }
    }

    //动态规划剪绳子得最大乘积
    public static int maxCuttingSolution(int length) {
        if (length <= 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int[] products = new int[length + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        int max = 0;
        //i是顺序递增的，计算的顺序是自下而上的
        for (int i = 4; i <= length; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                //在求f(i)之前，对于每一个j而言，f(j)都已经求解出来了
                int product = products[j] * products[i - j];
                if (max < product) {
                    max = product;
                }
                products[i] = max;
            }
        }
        return products[length];
    }

    /**
     * 当长度>=5时，尽可能多剪长度为3得绳子，当剩下绳子长度为4时，把绳子剪成长度为2得绳子
     */
    public static int maxCuttingSolution1(int length) {
        if (length <= 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        //尽可能剪去长度为3的绳子段
        int cutThree = length / 3;
        if (length - cutThree * 3 == 1) {
            cutThree -= 1;
        }
        int cutTwo = (length - cutThree * 3) / 2;
        return (int) Math.pow(3, cutThree) * (int) Math.pow(2, cutTwo);
    }

}
