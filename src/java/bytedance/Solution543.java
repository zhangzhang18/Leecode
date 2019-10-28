package bytedance;

import interview.tree.entity.TreeNode;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-25
 */
public class Solution543 {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        deep(root);
        return max;
    }

    int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        max = max > left + right ? max : left + right;
        return left > right ? left + 1 : right + 1;
    }
}
