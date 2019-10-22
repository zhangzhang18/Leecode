package interview.linkList.entity;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-12
 */
public class ListNode {
    public int val;
    public ListNode next;


    public ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }


}
