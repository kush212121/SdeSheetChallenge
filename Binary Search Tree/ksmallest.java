/*
    Time Complexity : O(N)
    Space Complexity : O(N)

    Where 'N' is the number of nodes in the given binary search tree.
*/

import java.util.ArrayList;

public class Solution 
{

	//	Stores the inorder traversal of the tree in "nodes".
	private static void inorder(TreeNode<Integer> root, ArrayList<Integer> nodes) 
	{
		if (root == null) 
		{
			//	Base case.
			return;
		}

		//	Recur for the left subtree.
		inorder(root.left, nodes);

		//	Store the current node value in "nodes".
		nodes.add(root.data);

		//	Recur for the right subtree.
		inorder(root.right, nodes);
	}

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//	To store the inorder traversal of the BST.
		ArrayList<Integer> nodes = new ArrayList<Integer>();

		inorder(root, nodes);

		return nodes.get(k - 1);
	}
}
