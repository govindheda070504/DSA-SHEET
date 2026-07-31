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

    // Returns the height of the tree
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lheight = height(root.left);
        int rheight = height(root.right);

        // Height = 1 + maximum of left and right subtree heights
        return Math.max(lheight, rheight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        // Empty tree has diameter 0
        if (root == null) {
            return 0;
        }

        // Diameter present entirely in left subtree
        int ldia = diameterOfBinaryTree(root.left);

        // Diameter present entirely in right subtree
        int rdia = diameterOfBinaryTree(root.right);

        // Diameter passing through current node
        int currdia = height(root.left) + height(root.right);

        // Return the maximum of the three cases
        return Math.max(currdia, Math.max(ldia, rdia));
    }
}


// not optimal uses o(n^2) complexity
