package Stack and Queue;

public class celebrity {
    public static int findCelebrity(int n) {

        // Calculating indegree and outdegree of each nodes.
	    int[] indegree = new int[n];
	    int[] outdegree = new int[n];

	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	            if(Runner.knows(i, j)) {
	                indegree[j]++;
	                outdegree[i]++;
	            }
	        }
	    }

	    // Finding Celebrity.
	    int celebrity = -1;

	    for(int i = 0; i < n; i++) {
	        if(indegree[i] == n - 1 && outdegree[i] == 0) {
	            celebrity = i;
	            break;
	        }
	    }

	    return celebrity;
    }
}
