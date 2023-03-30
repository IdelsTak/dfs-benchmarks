package benchmarks;

import benchmarks.BinaryTree.Node;

public class BenchmarkUnbalancedTree {

    public static void main(String[] args) {
        // Create an unbalanced binary tree with a deep left branch
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(5);

        // Run the depth-first search algorithm and time it
        long startTime = System.nanoTime();
        BinaryTree tree = new BinaryTree(root);
        tree.dfs();
        long endTime = System.nanoTime();

        // Calculate the elapsed time in nanoseconds
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time (nanoseconds): " + elapsedTime);
    }

}
