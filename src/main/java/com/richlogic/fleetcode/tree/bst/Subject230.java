package com.richlogic.fleetcode.tree.bst;

import com.richlogic.fleetcode.TreeNode;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree.bst</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/24
 */
public class Subject230 {

    private int index;
    private int k;
    private int target;
    public int kthSmallest(TreeNode root, int k) {
        index = 0;
        this.k = k;
        this.find(root);
        return target;
    }

    private void find(TreeNode root) {
        if (root == null) {
            return;
        }

        find(root.left);
        index ++;
        if (index == k) {
            target = root.val;
        }
        find(root.right);
    }
}
