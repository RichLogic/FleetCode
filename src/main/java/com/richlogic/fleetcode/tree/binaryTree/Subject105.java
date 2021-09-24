package com.richlogic.fleetcode.tree.binaryTree;

import com.richlogic.fleetcode.TreeNode;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree.binaryTree</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/23
 */
public class Subject105 {

    private int[] preorder;
    private int[] inorder;
    private int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.index = 0;
        return this.recursion(0, inorder.length - 1);
    }

    public TreeNode recursion(int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[index]);
        int pivot = this.findPivot(start, end);
        index ++;

        node.left = recursion(start, pivot - 1);
        node.right = recursion(pivot + 1, end);
        return node;
    }

    private int findPivot(int start, int end) {
        int target = preorder[index];
        for (int i=start; i<=end; i++) {
            if (target == inorder[i]) {
                return i;
            }
        }

        return -1;
    }

}
