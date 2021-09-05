package com.richlogic.fleetcode;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.backtrack</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/05/07
 */
public class Node {

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
