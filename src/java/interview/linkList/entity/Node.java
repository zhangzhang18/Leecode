package interview.linkList.entity;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-12
 */
public class Node {
    public int value;
    public Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
