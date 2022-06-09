public class postorder {
    //List<Integer> pre = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<Integer>();
        if(root==null) return pre;
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        while(!st.empty()){
            root=st.pop();
            pre.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        //if(root==null)
        //    return pre;
        //pre.add(root.val);
        //preorderTraversal(root.left);
        //preorderTraversal(root.right);
        return pre;
    }
}
