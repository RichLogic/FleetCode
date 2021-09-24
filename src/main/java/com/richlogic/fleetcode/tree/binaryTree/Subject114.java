package com.richlogic.fleetcode.tree.binaryTree;

import com.richlogic.fleetcode.TreeNode;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree.normal</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/23
 */
public class Subject114 {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode node = root;
        while (node.right != null) {
            node = node.right;
        }
        node.right = right;
    }

}
