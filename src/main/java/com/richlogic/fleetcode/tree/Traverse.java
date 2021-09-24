package com.richlogic.fleetcode.tree;

import com.richlogic.fleetcode.TreeNode;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/23
 */
public class Traverse {

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " | ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " | ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " | ");
    }
}
