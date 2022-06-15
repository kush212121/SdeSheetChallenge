public class leftview {
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        leftSideView(root, result, 0);
        return result;
      // Your code here
    }
    public void leftSideView(Node curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        leftSideView(curr.left, result, currDepth + 1);
        leftSideView(curr.right, result, currDepth + 1);
    }
}
