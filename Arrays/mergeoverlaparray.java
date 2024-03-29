package Arrays;

public class mergeoverlaparray {
    static ArrayList < List < Integer >> merge(ArrayList < List < Integer >> intervals) {

        Collections.sort(intervals, (a,b)->a.get(0)-b.get(0));
        ArrayList < List < Integer >> merged = new ArrayList < > ();

        for (int i = 0; i < intervals.size(); i++) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < intervals.get(i).get(0)) {
                ArrayList < Integer > v = new ArrayList < > ();
                v.add(intervals.get(i).get(0));
                v.add(intervals.get(i).get(1));

                merged.add(v);
            } else {
                
                merged.get(merged.size() - 1).set(1, Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
            }
        }

        return merged;
    }
}
