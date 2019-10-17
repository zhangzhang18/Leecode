package dto;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-12
 */
public class Tree {
    public int value;
    public Tree left;
    public Tree right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}
