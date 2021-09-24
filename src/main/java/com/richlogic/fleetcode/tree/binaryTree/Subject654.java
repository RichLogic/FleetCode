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
public class Subject654 {

    int[] nums;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return this.recursion(0, nums.length - 1);
    }

    public TreeNode recursion(int start, int end) {
        if (start > end) {
            return null;
        }
        int pivot = this.findMax(start, end);
        TreeNode node = new TreeNode(nums[pivot]);
        node.left = recursion(start, pivot - 1);
        node.right = recursion(pivot + 1, end);

        return node;
    }

    private int findMax(int start, int end) {
        int index = -1;
        int value = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (nums[i] > value) {
                index = i;
                value = nums[i];
            }
        }
        return index;
    }
}
