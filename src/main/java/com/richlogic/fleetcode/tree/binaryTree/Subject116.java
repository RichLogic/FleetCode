package com.richlogic.fleetcode.tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree.normal</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/23
 */
public class Subject116 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        Subject116 s = new Subject116();
        s.connect(node1);
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            Node target = null;
            int len = queue.size();
            for (int i=0; i<len; i++) {
                Node node = queue.poll();
                if (node == null) {
                    continue;
                }
                if (target != null) {
                    target.next = node;
                }
                target = node;
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return root;
    }

    public Node connect2(Node root) {
        if (root == null) {
            return null;
        }
        recursion(root.left, root.right);
        return root;
    }

    public void recursion(Node left, Node right) {
        if (left == null || right == null) {
            return;
        }
        left.next = right;
        recursion(left.left, left.right);
        recursion(left.right, right.left);
        recursion(right.left, right.right);
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
