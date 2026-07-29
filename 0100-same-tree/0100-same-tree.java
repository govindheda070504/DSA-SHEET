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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //. intuition
        /*


        1.Compare the current nodes first.
            * If both are null, they match.
            * If one is null and the other isn't, the trees are different.
            * If their values are different, the trees are different.
        2.If the current nodes match, compare their children.
        */



        if(p==null && q==null){
            return true;
        }

        if(p==null|| q==null){
            return false;
        }

        if(p.val!= q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}