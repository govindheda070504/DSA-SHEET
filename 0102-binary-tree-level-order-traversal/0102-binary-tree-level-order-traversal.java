/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        // Stores the final answer
        List<List<Integer>> result = new ArrayList<>();

        // If tree is empty
        if (root == null) {
            return result;
        }

        // Queue for BFS
        Queue<TreeNode> q = new LinkedList<>();

        // Add root and a null marker
        q.add(root);
        q.add(null);

        // Stores the current level
        List<Integer> currentLevel = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode currNode = q.remove();

            // End of one level
            if (currNode == null) {

                // Add current level to the answer
                result.add(currentLevel);

                // If queue is empty, traversal is complete
                if (q.isEmpty()) {
                    break;
                }

                // Start a new level
                currentLevel = new ArrayList<>();

                // Add another null marker
                q.add(null);

            } else {

                // Add current node's value
                currentLevel.add(currNode.val);

                // Add left child
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                // Add right child
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        return result;
    }
}

/*
Short Approach (Null Marker Approach)

We use Breadth-First Search (BFS) with a Queue.

Put the root into the queue.
Put null after the root. This null acts as a level separator.
Keep removing nodes from the queue.
If the removed node is not null:
Add its value to the current level.
Add its left and right children (if they exist) to the queue.
If the removed node is null:
It means the current level is finished.
Add the current level list to the final answer.
If the queue is not empty, create a new list for the next level and add another null to mark the end of the next level.

Continue until the queue becomes empty.
*/
