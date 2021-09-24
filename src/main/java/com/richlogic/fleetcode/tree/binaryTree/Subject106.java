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
public class Subject106 {

    private int[] inorder;
    private int[] postorder;
    int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        this.index = inorder.length - 1;
        return this.recursion(0, inorder.length - 1);
    }

    public TreeNode recursion(int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(postorder[index]);
        int pivot = this.findPivot(start, end);
        index --;

        node.right = recursion(pivot + 1, end);
        node.left = recursion(start, pivot - 1);
        return node;
    }

    private int findPivot(int start, int end) {
        int target = postorder[index];
        for (int i=start; i<=end; i++) {
            if (target == inorder[i]) {
                return i;
            }
        }

        return -1;
    }

}
