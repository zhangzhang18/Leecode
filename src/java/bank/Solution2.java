package bank;

import interview.linkList.entity.ListNode;

import java.util.Stack;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-20
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode result = node;
        int num = 0;
        while (l1 != null || l2 != null) {
            int l1Num = l1 == null ? 0 : l1.val;
            int l2Num = l2 == null ? 0 : l2.val;
            int count = l1Num + l2Num + num;
            num = count / 10;
            node.next = new ListNode(count % 10);
            node = node.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }

        if (num > 0) {
            node.next = new ListNode(num);
        }
        return result.next;
    }

    /**
     * 看错题目逆序 看出 正序☺
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        Stack<Integer> l1Stack = new Stack<>();
        while (l1 != null) {
            l1Stack.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> l2Stack = new Stack<>();
        while (l2 != null) {
            l2Stack.push(l2.val);
            l2 = l2.next;
        }
        ListNode node = null;
        int num = 0;
        while (!l1Stack.empty() && !l2Stack.empty()) {
            int count = l1Stack.pop() + l2Stack.pop() + num;
            num = count / 10;
            ListNode newNode = new ListNode(count % 10);
            newNode.next = node;
            node = newNode;
        }
        while (!l1Stack.empty()) {
            int count = l1Stack.pop() + num;
            num = count / 10;
            ListNode newNode = new ListNode(count % 10);
            newNode.next = node;
            node = newNode;
        }
        while (!l2Stack.empty()) {
            int count = l2Stack.pop() + num;
            num = count / 10;
            ListNode newNode = new ListNode(count % 10);
            newNode.next = node;
            node = newNode;
        }
        if (num != 0) {
            ListNode newNode = new ListNode(1);
            newNode.next = node;
            node = newNode;
        }
        return node;
    }


}
