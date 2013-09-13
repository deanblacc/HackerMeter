package com.java.hackermeter.data_structures;

import java.util.*;

/**
 * Given a binary tree, we want to perform a preorder traversal. A preorder traversal is defined as follows.
 *
 * 1. Print the root
 * 2. Print the elements in (left), if any, using preorder traversal
 * 3. Print the elements in (right), if any, using preorder traversal
 *
 * The first line of the input will be an integer N (1 <= N <= 1000), indicating the number of test cases.
 *
 * Each test case consists of one line containing an integer K (1 <= K <= 100),
 * followed by K lines containing two space-separated strings A and B,
 * representing that B is a child node of A. When A has two children, the left one will always be given first. Each test case is defined such that the tree has only one root.
 *
 * For each test case, print out the node names in preorder, one per line.
 * No blank line between test cases.
 */
public class PreorderPerusal {
    public static void run(Scanner scanner) {
        //Code here!
        int x = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");
        Node root = new Node(line[0]);
        root.left = new Node(line[1]);

        for(int i = 0; i < x-1; i++) {
            line = scanner.nextLine().split(" ");
            addChild(root, new Node(line[0]), new Node(line[1]));
        }

        preorderPrint(root);
    }

    public static boolean addChild(Node root, Node query, Node child) {
        if(root == null) return false;

        if(root.equals(query))
            if(root.left == null) {
                root.left = child;
                return true;
            } else {
                root.right = child;
                return true;
            }

        if(!addChild(root.left, query, child))
            return addChild(root.right, query, child);

        return true;
    }

    public static void preorderPrint(Node root) {
        if(root == null) return;
        System.out.println(root.val); 	//print root
        preorderPrint(root.left);		//print left
        preorderPrint(root.right);		//print right
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int cases = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < cases; i++) {
            run(scanner);
        }
    }
}

class Node {
    /**
     * So im not using getters & setters !? Sue me !!!
     */
    Node left, right;
    String val;

    public Node(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        Node n = (Node) o;
        if (this.val.equals(n.val)) return true;
        else return false;
    }
}