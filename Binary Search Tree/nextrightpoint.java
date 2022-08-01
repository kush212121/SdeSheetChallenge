/*
    Time complexity: O(N)
    Space complexity: O(N)

    Where 'N' is the number of nodes in a binary tree.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {

    	// Create queue and enqueue address of root in it.
	    Queue< BinaryTreeNode<Integer> > que = new LinkedList<>();
	    que.add(root);

	    // Number of nodes in current level.
	    int nodesCount = 1;

	    while(que.size() != 0) {
	        BinaryTreeNode<Integer> previous = null;

	        // Traversing over nodes of current level.
	        while(nodesCount > 0) {
	            if(previous != null) {
	                previous.next = que.peek();
	            }
	            previous = que.peek();

	            // Pushing left and right child of current node in queue. 
	            if(que.peek().left != null) {
	                que.add(que.peek().left);
	            } 
	            if(que.peek().right != null) {
	                que.add(que.peek().right);
	            }
	            que.remove();
	            nodesCount--;
	        }
	        
	        // Updating number of nodes in current level. 
	        nodesCount = que.size();
	    }
	}
}