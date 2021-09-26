package com.richlogic.fleetcode.tree.bst;

import com.richlogic.fleetcode.TreeNode;


/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree.bst</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/25
 */
public class Subject538 {

    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;
    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }

}
