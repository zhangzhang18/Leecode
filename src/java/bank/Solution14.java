package bank;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-28
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        String pre = strs[0];
        for (String s : strs) {
            while (s.indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) {
                    return "";
                }
            }
        }
        return pre;
    }
}
