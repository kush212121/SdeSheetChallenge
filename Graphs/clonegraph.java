/*
    Time Complexity: O(N + M)
    Space Complexity: O(N)

    Where N is the number of nodes
    and M is the number of edges in the given graph.
*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Solution {
	public static graphNode cloneGraphHelper(graphNode node, HashMap<graphNode, graphNode> copies) {

		if (node == null) {
			return null;
		}

		// Create a graph node which denotes the node of the cloned graph.
		graphNode copy = new graphNode(node.data);

		// Update the HashMap.
		copies.put(node, copy);

		// Queue used for the BFS.
		Queue<graphNode> level = new LinkedList<>();

		// Push source node.
		level.add(node);

		while (!level.isEmpty()) {
			// Take the the front element from the queue.
			graphNode cur = level.poll();

			// Get corresponding Cloned Graph Node.
			graphNode cloneNodeU = copies.get(cur);
			if (cur.neighbours != null) {
				ArrayList<graphNode> v = cur.neighbours;
				for (graphNode GraphNode : v) {
          
					/*
					  Get the corresponding cloned node 
            if the node is not cloned then we will
					  simply get a null.
					 */
					graphNode cloneNodeG = copies.get(GraphNode);

					// Check if this node has already been created.
					if (cloneNodeG == null) {
						level.add(GraphNode);

						
						/*
              If not then create a new Node 
              and put into the HashMap.
						*/
            cloneNodeG = new graphNode(GraphNode.data);
						copies.put(GraphNode, cloneNodeG);
					}

					/*
					  Add the 'cloneNodeG' to neighbour 
            array List of the cloneNodeG.
					*/
					cloneNodeU.neighbours.add(cloneNodeG);
				}
			}
		}

		return copies.get(node);
	}

	public static graphNode cloneGraph(graphNode node) {
		// Create a HashMap.
		HashMap<graphNode, graphNode> copies = new HashMap<>();

		// Return the source node of cloned graph.
		return cloneGraphHelper(node, copies);
	}
}