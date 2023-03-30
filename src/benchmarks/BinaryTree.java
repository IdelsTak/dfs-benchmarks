package benchmarks;

import java.util.Stack;

public class BinaryTree {

    static class Node {

        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    BinaryTree(Node root) {
        this.root = root;
    }

    public void dfs() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.value);

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
    
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        BinaryTree tree = new BinaryTree(root);
//        tree.dfs();
//    }
}


    
