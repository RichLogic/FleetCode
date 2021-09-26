package com.richlogic.fleetcode.tree.binaryTree;

import com.richlogic.fleetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree.binaryTree</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/24
 */
public class Subject652 {

    private Map<String, Integer> serializeMap = new HashMap<>();
    private List<TreeNode> resultList = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        this.build(root);
        return resultList;
    }

    private void build(TreeNode root) {
        if (root == null) {
            return;
        }
        build(root.left);
        build(root.right);

        String s = this.serialize(root);
        if (serializeMap.containsKey(s)) {
            int times = serializeMap.get(s);
            if (times == 1) {
                resultList.add(root);
            }
            serializeMap.put(s, times + 1);
        } else {
            serializeMap.put(s, 1);
        }
    }

    private String serialize(TreeNode node) {
        StringBuilder builder = new StringBuilder();
        encode(node, builder);
        return builder.toString();
    }

    private void encode(TreeNode node, StringBuilder builder) {
        if (node == null) {
            builder.append("#").append(",");
            return;
        }

        builder.append(node.val).append(",");
        encode(node.left, builder);
        encode(node.right, builder);
    }
}
