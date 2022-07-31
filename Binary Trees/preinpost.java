public class preinpost {
    class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode node,int num){
            this.node = node;
            this.num=num;
        }
    }
    public class Solution {
        public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
            List<Integer<Integer>> res= new ArrayList<ArrayList<Integer>>();
            List<Integer> pre= new ArrayList<Integer>();
            List<Integer> in= new ArrayList<Integer>();
            List<Integer> post= new ArrayList<Integer>();
            if(root==null) return res;
            Stack<Pair> st = new Stack<Pair>>();
            
            st.push(new Pair(root,1));
            
            while(!st.isEmpty()){
                Pair it =st.pop();
                if(it.num==1){
                    pre.add(it.node.val);
                    it.num++;
                     if(temp.left!==null)
                       st.push(new Pair(it.node.left,1));
                }
                if(it.num==2){
                    in.add(it.node.val);
                    it.num++;
                    if(temp.right!==null)
                    st.push(new Pair(it.node.right,1));
                }
                else
                    post.add(it.node.val); 
            }
            res.add(pre);
            res.add(in);
            res.add(post);
            
            return res;
            
            // Write your code here.
        }
    }
    
}
