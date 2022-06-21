public class pathtogivennode {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(A==null) return arr;
        getpath(A,arr,B);
        return arr;
            }
    boolean getpath(TreeNode root,ArrayList<Integer> arr,int x){
        if(root==null) return false;
        arr.add(root.val);
        if(root.val==x) return true;
        if(getpath(root.left,arr,x) || getpath(root.right,arr,x)) return true;
        arr.remove(arr.size()-1);
        return false;
    }
}
