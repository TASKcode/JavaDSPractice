package com.demo.java.code.tree;

import javax.swing.tree.TreeNode;

public class Tree {

    private static class Node {
        private int value;
        private Node lChild;
        private Node rChild;

        public Node(int v, Node left, Node right) {
            value = v;
            lChild = left;
            rChild = right;
        }

        public Node(int v) {
            value = v;
            lChild = null;
            rChild = null;
        }
    }

    private Node root;

    public Tree() {
        root = null;
    }


    public Node levelOrderBinaryTree(int[] arr) {
        root = levelOrderBinaryTree(arr, 0);
        return root;

    }

    private Node levelOrderBinaryTree(int[] arr, int start) {
        int size = arr.length;
        Node currentNode = new Node(arr[start]);
        int left = 2 * start + 1;
        int right = 2 * start + 2;

        if (left < size) {
            currentNode.lChild = levelOrderBinaryTree(arr, left);
        }
        if (right < size) {
            currentNode.rChild = levelOrderBinaryTree(arr, right);
        }
        return currentNode;
    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.lChild);
            System.out.println("" + node.value);
            printInOrder(node.rChild);

        }
    }
}
