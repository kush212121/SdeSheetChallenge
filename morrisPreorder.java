public class morrisPreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<Integer>();
        // if(root==null) return pre;
        // Stack<TreeNode> st=new Stack<TreeNode>();
        // st.push(root);
        // while(!st.empty()){
        //     root=st.pop();
        //     pre.add(root.val);
        //     if(root.right!=null){
        //         st.push(root.right);
        //     }
        //     if(root.left!=null){
        //         st.push(root.left);
        //     }
        //}
        //if(root==null)
        //    return pre;
        //pre.add(root.val);
        //preorderTraversal(root.left);
        //preorderTraversal(root.right);
        // morris preorder
        //
        TreeNode cur=root;
        while(cur!= null){
            if(cur.left!= null){
                TreeNode temp=cur.left;
                while(temp.right!=null && temp.right!=cur){
                    temp=temp.right;
                }
                if(temp.right==cur){
                    temp.right=null;
                    cur=cur.right;
                }
                else{
                    pre.add(cur.val);
                    temp.right=cur;    
                    cur=cur.left;
                }}
                else{
                    pre.add(cur.val);
                    cur=cur.right;
                }
            }

        return pre;
    }
}
