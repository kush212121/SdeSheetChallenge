package Binary Search;

public class matrixmedian {
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) 
	{

		int n = matrix.size();
		int m = matrix.get(0).size();

		// ArrayList to store the elements in given matrix.
		ArrayList<Integer> data = new ArrayList<Integer>();

		// Iterate through matrix and push elements in the vector.
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				data.add(matrix.get(i).get(j));
			}
		}

		// Sort the vector of elements in non-decreasing order.
		Collections.sort(data);

		// Return the median which is (N*M)/2 th element in the vector.
		return data.get((n * m) / 2);
	}
}
