package com.richlogic.fleetcode.tree.binaryTree;

import com.richlogic.fleetcode.TreeNode;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/23
 */
public class Subject226 {

    public TreeNode invertTree(TreeNode root) {
        recursion(root);
        return root;
    }

    public void recursion(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        recursion(node.left);
        recursion(node.right);
    }

}
