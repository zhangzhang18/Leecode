package bytedance;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-26
 */
public class LRUCache {
    class Node {
        int key;
        int value;
    }

    private int capacity;
    private LinkedList<Node> linkedList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.linkedList = new LinkedList<>();
    }

    public int get(int key) {
        int result = -1;
        Iterator<Node> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.key == key) {
                result = node.value;
                iterator.remove();
                linkedList.addFirst(node);
                break;
            }
        }
        return result;
    }

    public void put(int key, int value) {
        Iterator<Node> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.key == key) {
                iterator.remove();
                break;
            }
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        if (linkedList.size() >= capacity) {
            linkedList.removeLast();
        }
        linkedList.addFirst(node);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

    }
}
