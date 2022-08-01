/*
    Time Complexity : O(N)
    Space Complexity : O(N)

    where 'N' is the number of nodes in the BST.
*/

import java.util.ArrayList;

public class Solution {
	public static void inorder(BinaryTreeNode<Integer> root, ArrayList < Integer > inorderArray)
	{
	    if (root == null)
	    {
	        return;
	    }

	    inorder(root.left, inorderArray);

	    inorderArray.add(root.data);

	    inorder(root.right, inorderArray);
	}

	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// To store the inorder traversal of the BST.
	    ArrayList < Integer > inorderArray = new ArrayList < Integer > ();

	    inorder(root, inorderArray);

	    int predecessor = -1, successor = -1;

	    for (int i = 0; i < inorderArray.size(); i++)
	    {
	        if (inorderArray.get(i) == key)
	        {
	            // If predecessor exist.
	            if (i - 1 >= 0)
	            {
	                predecessor = inorderArray.get(i - 1);
	            }

	            // If successor exist.
	            if (i + 1 < inorderArray.size())
	            {
	                successor = inorderArray.get(i + 1);
	            }
	            break;
	        }
	    }
		
        ArrayList < Integer > sol = new ArrayList < Integer > ();
        sol.add(predecessor);
        sol.add(successor);
	    return sol;
	}
}