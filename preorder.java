public class preorder {
    //List<Integer> post = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        //
        // Recursion Approach
        //
        // if(root==null)
        //     return post;
        // postorderTraversal(root.left);
        // postorderTraversal(root.right);
        // post.add(root.val);
        // return post;
        //
        // 1 Stack Approach
        //
       /* List<Integer> post = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        if(root==null)
            return post;
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            post.add(st2.pop().val);
        }
        return post;*/
        //
        // 2 Stack Approach
        //
        List<Integer> post = new ArrayList<>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        if(root==null)
            return post;
        st.push(root);
        TreeNode cur= root.left;
        TreeNode temp;
        while(cur!=null || !st.isEmpty()){
            if(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            else{
                temp=st.peek().right;
                if(temp==null){
                    temp = st.peek();
                    st.pop();
                    post.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp = st.peek();
                        st.pop();
                        post.add(temp.val);
                    }
                }
                else cur=temp;
            }
        } 
        return post;    
    }
}
