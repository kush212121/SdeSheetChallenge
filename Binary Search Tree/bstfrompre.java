
/*
	Time Complexity: O(N^2)
	Space Complexity: O(N^2)
	
	Where N is the number nodes in the tree.
*/

import java.util.ArrayList;

public class Solution {

	private static TreeNode<Integer> util(ArrayList<Integer> preOrder) {

		// If the length of the preOrder traversal is 0 return NULL.
		if (preOrder.size() == 0) {
			return null;
		}

		// Set the root as the first element of the preOrder traversal.
		TreeNode<Integer> root = new TreeNode<>(preOrder.get(0));

		// All the nodes smaller than the root will go in the left subtree.
		ArrayList<Integer> leftPreOrder = new ArrayList<>();
		for (int i = 1; i < preOrder.size(); i++) {
			if (preOrder.get(i) < preOrder.get(0)) {
				leftPreOrder.add(preOrder.get(i));
			}
		}

		// All the nodes greater than the root will go in the right subtree.
		ArrayList<Integer> rightPreOrder = new ArrayList<>();
		;
		for (int i = 1; i < preOrder.size(); i++) {
			if (preOrder.get(i) > preOrder.get(0)) {
				rightPreOrder.add(preOrder.get(i));
			}
		}

		// Call the util function on left and right subtree of the root.
		root.left = util(leftPreOrder);
		root.right = util(rightPreOrder);

		// Return the root.
		return root;
	}

	public static TreeNode<Integer> preOrderTree(int[] preOrder) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : preOrder) {
			list.add(i);
		}

		// Return the util function.
		return util(list);
	}

}
