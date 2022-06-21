public class boundarytrav {
    ArrayList<Integer> res= new ArrayList<Integer>();
    void leafnodes(Node root, ArrayList<Integer> res){
        if(root==null) return;
        if(isleaf(root)){
        res.add(root.data);
        return;
        }
        leafnodes(root.left,res);
        leafnodes(root.right,res);
    }
    boolean isleaf(Node root){
        if(root.left == null && root.right == null)
        return true;
        else
        return false;
    }
	ArrayList <Integer> boundary(Node root)
	{
	   
	   Stack <Node> st =new Stack<Node>();
	   if(root==null) return res;
	   if(!isleaf(root)) res.add(root.data);
	   Node cur = root.left;
	   while(cur!=null){
	       if(!isleaf(cur))
	       res.add(cur.data);
	       if(cur.left!=null)
	       cur=cur.left;
	       else
	       cur=cur.right;
	       }
	       
	       leafnodes(root,res);
	       if(root.right!=null){
	       cur=root.right;
	       while(cur!=null){
	       if(!isleaf(cur))
	       st.push(cur);
	       if(cur.right!=null)
	       cur=cur.right;
	       else
	       cur=cur.left;
	       }
	      while(!st.isEmpty()){
	           res.add(st.pop().data);
	       }
	       }
	       return res;
	}
}
