package bank;

import interview.linkList.entity.ListNode;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-19
 */
public class Solution148 {

    public ListNode sortList(ListNode head) {

        if (head != null && head.next != null) {
            ListNode fast = head.next, slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode tmp = slow.next;
            slow.next = null;
            ListNode left = sortList(head);
            ListNode right = sortList(tmp);
            ListNode newNode = new ListNode(0);
            ListNode result = newNode;
            while (left != null && right != null) {
                if (left.val > right.val) {
                    newNode.next = right;
                    right = right.next;
                } else {
                    newNode.next = left;
                    left = left.next;
                }
                newNode = newNode.next;
            }
            newNode.next = left != null ? left : right;
            return result.next;
        }
        return head;

    }


}
