/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    where 'N' is the total number of nodes of the BST.
*/

import java.util.ArrayList;

public class Solution {
	public static void inorder(TreeNode < Integer > root, ArrayList < Integer> inTraversal)
	{
		if (root == null)
		{
			return;
		}

		// Recurse over left subtree. 
		inorder(root.left, inTraversal);

	    inTraversal.add(root.data);

		// Recurse over right subtree.
		inorder(root.right, inTraversal);
	}

	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		ArrayList < Integer > inTraversal = new ArrayList < Integer >();

		inorder(root, inTraversal);

		int n = inTraversal.size();

		if (k > n)
		{
			return -1;
		}
		
		return inTraversal.get(n - k);
	}
}