/*
    Time Complexity: O(N+M)
    Space Complexity: O(N)

    Where N is the number of nodes and M is the number of edges in the given graph.
*/

import java.util.ArrayList;

class Graph {
    private static int noOfNodes;

    // Pointer to an array containing adjacency lists.
    private static ArrayList < Integer > adj[];

    // Act as Constructor.
    Graph(int noOfNodes) {
        adj = new ArrayList[noOfNodes];

        for (int i = 0; i < noOfNodes; i++) {
            adj[i] = new ArrayList < Integer > ();
        }

        this.noOfNodes = noOfNodes;
    }

    // To add an edge to between two nodes in a Graph.
    public void addEdge(int a, int b) {
        // Add b to a's list.
        adj[a].add(b);
    }

    // Returns true if there exists a cycle in the given graph.
    public boolean checkCyclic() {

        /* 
            Initialise checkVisited as false 
            i.e. nodes are not visited yet.
        */
        ArrayList < Boolean > checkVisited = new ArrayList < Boolean > (noOfNodes);

        // Initialise nodes as not a part of recursion stack.
        ArrayList < Boolean > rStack = new ArrayList < Boolean > (noOfNodes);

        for (int i = 0; i < noOfNodes; i++) {
            checkVisited.add(false);
            rStack.add(false);
        }

        /*
            Call the recursive helper function to
            detect cycle in different DFS trees.
        */

        for (int i = 0; i < noOfNodes; i++) {
            if (checkCyclicHelper(i, checkVisited, rStack)) {
                return true;
            }
        }
        return false;
    }

    // Helper function for checkCyclic().
    private boolean checkCyclicHelper(int v, ArrayList < Boolean > checkVisited, ArrayList < Boolean > rStack) {

        if (checkVisited.get(v) == false) {

            /* 
                Make the current node as visited 
                and part of recursion stack.
            */
            checkVisited.set(v, true);
            rStack.set(v, true);

            for (int i = 0; i < adj[v].size(); ++i) {
                if (!checkVisited.get(adj[v].get(i)) && checkCyclicHelper(adj[v].get(i), checkVisited, rStack)) {
                    return true;
                } else if (rStack.get(adj[v].get(i))) {
                    return true;
                }
            }

            // Remove the vertex from recursion stack.
            rStack.set(v, false);
        }

        return false;
    }
}

public class Solution {
    public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
        Graph directedG = new Graph(n);

        int m = edges.size();

        for (int i = 0; i < m; i++) {
            directedG.addEdge(edges.get(i).get(0) - 1, edges.get(i).get(1) - 1);
        }

        return directedG.checkCyclic();
    }
}