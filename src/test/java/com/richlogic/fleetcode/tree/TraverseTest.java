package com.richlogic.fleetcode.tree;

import com.richlogic.fleetcode.TreeNode;
import org.junit.*;
import org.junit.runners.MethodSorters;

/**
 * <h3>FleetCode</h3>
 * <h4>com.richlogic.fleetcode.tree</h4>
 * <p></p>
 *
 * @author : richlogic
 * @since : 2021/09/23
 */
@FixMethodOrder(MethodSorters.JVM)
public class TraverseTest {

    private static TreeNode root;

    @BeforeClass
    public static void before() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        root = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        System.out.println("     1");
        System.out.println("   /   \\");
        System.out.println("  2     3");
        System.out.println(" / \\   / \\");
        System.out.println("4   5 6   7");
    }

    @After
    public void after() {
        System.out.println();
    }

    @Test
    public void preTest() {
        System.out.print("前序遍历：");
        Traverse traverse = new Traverse();
        traverse.preOrder(root);
    }

    @Test
    public void inTest() {
        System.out.print("中序遍历：");
        Traverse traverse = new Traverse();
        traverse.inOrder(root);
    }

    @Test
    public void postTest() {
        System.out.print("后序遍历：");
        Traverse traverse = new Traverse();
        traverse.postOrder(root);
    }

}
