public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        if (n < k)
            return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        int si = 0, ei = 0;
        while (ei < n) {
            map.put(arr.get(ei), map.getOrDefault(arr.get(ei), 0) + 1);
            ei++;
            if (ei >= k) {
                ans.add(map.size());
                map.put(arr.get(si), map.get(arr.get(si)) - 1);
                if (map.get(arr.get(si)) == 0)
                    map.remove(arr.get(si));
                si++;
            }
        }
        return ans;
    }
}

