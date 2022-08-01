/*
    Time Complexity: O(N ^ 2)
    Space Complexity: O(N)
    
    Where 'N' denotes the number of nodes in the BST.
*/

public class Solution {

	// Function to search the difference of current node's value and target 'k'.
	public static boolean search(BinaryTreeNode root, BinaryTreeNode cur, int diff) {
		if (root == null) {
			return false;
		}

		if (root.data < diff) {
			return search(root.right, cur, diff);
		}

		if (root.data > diff) {
			return search(root.left, cur, diff);
		}

		// This means that we have found the node having value equal to the diff.
		if (cur != root) {
			return true;
		}

		return false;
	}

	public static boolean dfs(BinaryTreeNode root, int k, BinaryTreeNode cur) {
		if (cur == null) {
			return false;
		}

		// Visit each node of BST and call the 'search' function.
		return (search(root, cur, k - cur.data) || dfs(root, k, cur.left) || dfs(root, k, cur.right));
	}

	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		return dfs(root, k, root);
	}
}