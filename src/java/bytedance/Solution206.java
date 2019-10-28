package bytedance;

import interview.linkList.entity.ListNode;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-25
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode pre = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
