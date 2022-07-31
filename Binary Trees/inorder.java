public class inorder {
    List<Integer> in = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // Stack<TreeNode> st=new Stack<>();
        // TreeNode node = root;
        // while(true){
        //     if(node!=null){
        //         st.push(node);
        //         node=node.left;
        //     }
        //     else{
        //         if(st.isEmpty()){
        //             break;
        //         }
        //         node=st.pop();
        //         in.add(node.val);
        //         node=node.right;
        //     }
        // }
        //       return in;
        if(root == null)
            return in;
        
        inorderTraversal(root.left);
        in.add(root.val);
        inorderTraversal(root.right);
        return in;
            
    }
}
