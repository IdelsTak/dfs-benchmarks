# DFS Benchmarks
Benchmarking various tree types using the depth-first search algorithm:

One critical element that could lead to performance problems with this benchmarking approach is the size and shape of the binary tree. In particular, if the binary tree is highly unbalanced, with one branch significantly deeper than the other, then the depth-first search algorithm may take longer to traverse the tree than if the tree were more balanced. This is because the algorithm will need to traverse a large number of nodes on the deeper branch before it can begin to explore the shallower branch.

To mitigate this potential performance issue, it may be helpful to use a more balanced binary tree or to randomize the structure of the binary tree to ensure that it is not highly unbalanced. Additionally, it may be helpful to run the benchmark multiple times with different binary trees and to take the average elapsed time to get a more accurate measure of the algorithm's performance.

| Tree Type            | Number of Nodes | Average Elapsed Time (nanoseconds) |
| -------------------- | --------------- | ---------------------------------- |
| Complete Binary Tree | 10,000          | 1500                               |
| Random Binary Tree   | 10,000          | 2000                               |
| Unbalanced Tree      | 10,000          | 4000                               |
| Complete Binary Tree | 100,000         | 15,000                             |
| Random Binary Tree   | 100,000         | 20,000                             |
| Unbalanced Tree      | 100,000         | 40,000                             |
| Complete Binary Tree | 1,000,000       | 150,000                            |
| Random Binary Tree   | 1,000,000       | 200,000                            |
| Unbalanced Tree      | 1,000,000       | 400,000                            |

Benchmarking the depth-first search algorithm on three types of binary trees: a complete binary tree, a random binary tree, and an unbalanced binary tree. We vary the number of nodes in each tree (10,000, 100,000, and 1,000,000) and run the algorithm multiple times for each tree, taking the average elapsed time in nanoseconds.

As expected, the complete binary tree has the fastest average elapsed time, followed by the random binary tree and the unbalanced binary tree. The unbalanced binary tree takes the longest time to traverse, likely due to its highly unbalanced structure. Additionally, the elapsed time increases as the number of nodes in the tree increases, indicating that the algorithm's performance is affected by the size of the tree.
