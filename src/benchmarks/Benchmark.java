package benchmarks;

import benchmarks.BinaryTree.Node;
import java.util.Random;

public class Benchmark {

    public static void main(String[] args) {
        // Create a binary tree with n nodes
        int n = 100000;
        Node root = createBinaryTree(n);

        // Run the depth-first search algorithm and time it
        long startTime = System.nanoTime();
        BinaryTree tree = new BinaryTree(root);
        tree.dfs();
        long endTime = System.nanoTime();

        // Calculate the elapsed time in nanoseconds
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time (nanoseconds): " + elapsedTime);
    }

    public static Node createBinaryTree(int n) {
        // Create a binary tree with n nodes
        BinaryTree.Node root = new Node(1);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(1000);
            insertNode(root, value);
        }
        return root;
    }

    public static void insertNode(Node node, int value) {
        // Insert a new node with the given value into the binary tree
        if (value < node.value) {
            if (node.left == null) {
                node.left = new BinaryTree.Node(value);
            } else {
                insertNode(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new BinaryTree.Node(value);
            } else {
                insertNode(node.right, value);
            }
        }
    }

}
