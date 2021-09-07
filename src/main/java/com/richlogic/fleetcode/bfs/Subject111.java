package com.richlogic.fleetcode.bfs;

import com.richlogic.fleetcode.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.bfs</h4>
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 * 示例 1：
 * 入：root = [3,9,20,null,null,15,7]
 * 出：2
 * 示例 2：
 * 入：root = [2,null,3,null,4,null,5,null,6]
 * 出：5
 * 提示：
 * 树中节点数的范围在 [0, 10⁵] 内
 * -1000 <= Node.val <= 1000
 * </p>
 *
 * @author : richlogic
 * @since : 2021/09/07
 */
public class Subject111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Set<TreeNode> visited = new HashSet<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }


}
