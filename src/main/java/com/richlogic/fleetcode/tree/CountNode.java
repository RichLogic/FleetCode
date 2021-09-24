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
public class CountNode {

    public int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

}
