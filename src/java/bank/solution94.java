package bank;

import interview.tree.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-28
 */
public class solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode now = root;
        while (now != null || !stack.isEmpty()) {
            while (now != null) {
                stack.push(now);
                now = now.left;
            }
            now = stack.pop();
            result.add(now.val);
            now = now.right;
        }
        return result;
    }
}
