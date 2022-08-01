/*
    Time Complexity: O(N^2)
    Space Complexity: O(N)
    
    where 'N' is the total number of nodes in the binary tree.
*/

import java.util.*; 

public class Solution {
	public static boolean isBST(TreeNode< Integer > root, int min, int max)
	{
		if (root == null)
		{
			return true;
		}

		if (root.data < min || root.data > max)
		{
			return false;
		}

		return isBST(root.left, min, root.data - 1) && 
			   isBST(root.right, root.data + 1, max);
	}

	public static int size(TreeNode < Integer > root)
	{
		if (root == null)
		{
			return 0;
		}
		
		return 1 + size(root.left) + size(root.right);
	}

	public static int largestBST(TreeNode < Integer > root) {
		// Current Subtree is BST.
		if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) == true)
		{
			return size(root);
		}
		
		// Find largest BST in left and right subtrees.
		return Math.max(largestBST(root.left), largestBST(root.right));
	}
}