package com.demo.java.code.tree;


public class TreeCode {


    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        tree.printInOrder(tree.levelOrderBinaryTree(arr));
    }
}
