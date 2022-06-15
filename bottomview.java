class Pair{
    Node it;
    int hd;
    Pair(Node it,int hd){
        this.it=it;
        this.hd=hd;
    }
}
public class bottomview {
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>(); 
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0)); 
         while(!q.isEmpty()) {
             int len=q.size();
             for(int i=0;i<len;i++){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.it; 
            map.put(hd, temp.data); 
            if(temp.left != null) {
                q.add(new Pair(temp.left, hd - 1)); 
            }
            if(temp.right != null) {
                q.add(new Pair(temp.right, hd + 1)); 
            }
        }}
            
         for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue()); 
        }
        return ans;// Code here
    }
}
