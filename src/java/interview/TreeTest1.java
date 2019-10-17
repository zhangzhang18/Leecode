package interview;

import dto.Tree;
import dto.TreeNode;

import java.util.*;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-17
 */
public class TreeTest1 {

    public static void printTree(Tree root) {
        if (root != null) {
            //下一层的节点数
            int nextLevel = 0;
            //当前层还没打印的节点说
            int tobePrint = 1;
            Stack<Tree> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                Tree node = stack.pop();
                System.out.println(node.value);
                if (node.left != null) {
                    stack.push(node.left);
                    nextLevel++;
                }
                if (node.right != null) {
                    stack.push(node.right);
                    nextLevel++;
                }
                tobePrint--;
                if (tobePrint == 0) {
                    System.out.println("\n");
                    tobePrint = nextLevel;
                    nextLevel = 0;

                }
            }
        }
    }

    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            int nextLevel = 0;
            int toBePrint = 1;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            Integer max = root.val;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    nextLevel++;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    nextLevel++;
                }
                toBePrint--;
                if (max == null) {
                    max = node.val;
                }
                if (node.val > max) {
                    max = node.val;
                }
                if (toBePrint == 0) {
                    result.add(max);
                    max = null;
                    toBePrint = nextLevel;
                    nextLevel = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(9);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = null;
        root2.right = root5;
        largestValues(root).forEach(System.out::println);

    }
}
