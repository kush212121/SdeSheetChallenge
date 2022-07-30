package Stack and Queue;

public class maxminwindowsize {
    public static int[] maxMinWindow(int[] arr, int n) 
    {
        // Definition: answer[i] will store the maximum of minimum of every window of size 'i'.
        int[] answer = new int[n];
        for (int i = 0; i < n; ++i) 
        {
            answer[i] = Integer.MIN_VALUE;
        }

        // Sliding on all possible windows
        for (int i = 0; i < n; ++i) 
        {
            for (int j = i; j < n; ++j) 
            {
                // Start is the starting index of current window
                int start = i;
                
                //  End is the ending index of current window
                int end = j;
                
                // Temp will store minimum element for the current window
                int temp = Integer.MAX_VALUE;
                
                for (int k = start; k <= end; ++k) 
                {
                    temp = Math.min(temp, arr[k]);
                }
                
                int length = end - start;
                
                // Update the answer of current window length
                answer[length] = Math.max(answer[length], temp);
            }
        }

        return answer;
    }
}
