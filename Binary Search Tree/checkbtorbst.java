/*
    Time Complexity : O(N)
    Space Complexity : O(N).

    Where N denotes number of nodes in the binary tree
*/

public class Solution {

    private static boolean helper(BinaryTreeNode<Integer> root, int min, int max) {
        // An empty tree is a BST
        if (root == null) {
            return true;
        }

        // False if this node violates the min/max constraint
        if ((root.data < min) || (root.data > max)) {
            return false;
        }

        // Otherwise check the subtrees recursively, modifying the min or max constraint
        boolean leftSearch = helper(root.left, min, root.data);
        boolean rightSearch = helper(root.right, root.data, max);

        return leftSearch & rightSearch;
    }

    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return (helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}