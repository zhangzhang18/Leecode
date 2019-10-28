package bytedance;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-25
 */
public class Solution122 {
    public int maxProfit2(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i + 1] > prices[i]) {
                count += prices[i + 1] - prices[i];
            }
        }
        return count;
    }

    public int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int count = 0;
        int start;
        int end;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            start = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            end = prices[i];
            count += end - start;

        }
        return count;
    }
}
