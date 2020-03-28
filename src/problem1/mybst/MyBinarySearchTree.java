/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int count;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public void insert(int data) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while (current != null) {
                parent = current;
                if (newnode.data < current.data) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            if (newnode.data < parent.data) {
                parent.left = newnode;
            } else {
                parent.right = newnode;
            }
        }
    }

    public void traverse() {
        TreeNode current = root;
        TreeNode parent = null;
        this.count = 0;
        while (current != null) {
            if (current.left == null) {
                count++;
            }
            if (parent.data < current.data) {
                System.out.println(current.data);
                current = current.left;
            }
            if (parent.data > current.data) {
                current = current.right;
            }
        }
    }
}