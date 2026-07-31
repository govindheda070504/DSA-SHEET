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
class Solution {

    // Stores the maximum diameter global variable 
    int diameter = 0;

    // Returns the height of the subtree rooted at 'root'
    public int height(TreeNode root) {

        // Base case: empty subtree has height 0
        if (root == null) {
            return 0;
        }

        // Recursively calculate height of left subtree
        int lheight = height(root.left);

        // Recursively calculate height of right subtree
        int rheight = height(root.right);

        // Diameter passing through the current node
        // = left subtree height + right subtree height
        // (This gives the number of edges in the longest path
        // passing through the current node.)
        diameter = Math.max(diameter, lheight + rheight);

        // Return the height of the current node
        // Height = 1 (current node) + maximum of left and right subtree heights
        return Math.max(lheight, rheight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        // Perform a single DFS traversal.
        // While computing heights, the helper function also updates
        // the maximum diameter found.
        height(root);

        // Return the maximum diameter (in edges)
        return diameter;
    }
}
    // optimal solution O(n) time complexity
