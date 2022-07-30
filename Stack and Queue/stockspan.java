package Stack and Queue;

public class stockspan {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        
        //  Size of array/list 'price'.
    	int n = price.size();

    	//  Make an array/list 'result' of size 'n' and fill it with 0.
    	ArrayList<Integer> result = new ArrayList<>();
    	for(int i=0; i<n; i++) {
    		result.add(0);
    	}

    	for(int i = 0; i < n; i++) {
        	
        	int j = i;
        	
        	//  Find span of Ninja coin on day 'i'.
	        while(j >= 0 && price.get(j) <= price.get(i)) {

	        	result.set(i, result.get(i)+1);
	            j -= 1;
	        }
    	}
    	return result;    	
    }
}
