/*
    Time Complexity: O(N)
    Space Complexity: O(log(N))

    where 'N' is the total number of elements in the given array.
*/
    
import java.util.ArrayList;

public class Solution {
    // Recursive function that return the root node of a subtree, for particular array segment.
    public static TreeNode<Integer> convert (ArrayList<Integer> arr, int start, int end)
    {
        // Base case.
        if(start > end)
        {
            return null;
        }

        else
        {
            // Find 'mid' index of array and make it root node. 
            int mid = (start+end)/2;
            TreeNode<Integer> rootNode = new TreeNode<Integer>(arr.get(mid));

            // Call 'convert' function for the left part of array to make leftSubtree of root node.
            rootNode.left = convert(arr,start,mid-1);

            // Call 'convert' function for the right part of array to make rightSubtree of root node.
            rootNode.right = convert(arr,mid+1,end);

            // Return the rootNode.
            return rootNode;
        }
    }

    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Call the recursive function to convert array into tree.
        TreeNode<Integer> root = convert(arr, 0, n-1);

        // Return the root node of tree.
        return root;
    }
}