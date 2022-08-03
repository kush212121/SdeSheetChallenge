import java.util.Arrays;
import java.util.Comparator;

public class Solution
{
    // Sort the jobs in the decreasing order of their profit.
    public static int jobScheduling(int[][] jobs)
    {
        Arrays.sort(jobs, new Comparator<int[]>(){
        public int compare(int[] first, int[] second)
        {
            if(first[1] < second[1]) return 1;
            else return -1;
        }
        });

        int maxProfit = 0;
        int maxDeadline = 0;

        // Find the maximum deadline among all the jobs.
        for (int i = 0; i < jobs.length; i++)
        {
            maxDeadline = Math.max(maxDeadline, jobs[i][0]);
        }

        // Create a slots array of size maxDeadline + 1.
        boolean[] slots = new boolean[maxDeadline + 1];

        // Initialize the array to false initially.
        for (int i = 0; i <= maxDeadline; i++)
        {
            slots[i] = false;
        }

        for (int i = 0; i < jobs.length; i++)
        {
            for (int j = jobs[i][0]; j > 0; j--)
            {

                if (slots[j] == false)
                {
                    maxProfit = maxProfit + jobs[i][1];
                    slots[j] = true;
                    break;
                }
            }
        }

        return maxProfit;
    }
}

