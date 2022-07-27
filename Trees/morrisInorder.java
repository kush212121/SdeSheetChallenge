public class morrisInorder {
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
//         if(root == null)
//             return in;
        
//         inorderTraversal(root.left);
//         in.add(root.val);
//         inorderTraversal(root.right);
//         return in;
        // Morris inorder
        //
            TreeNode cur =root;
            while(cur!= null){
                if(cur.left !=null){
                TreeNode temp=cur.left;
                while(temp.right != null && temp.right!= cur){
                    temp=temp.right;
                }
                if(temp.right== cur){
                    in.add(cur.val);
                    cur=cur.right;
                    temp.right=null;
                }
                else{
                    temp.right=cur;
                    cur=cur.left;
                }
            }
                else{
                    in.add(cur.val);
                    cur=cur.right;
                }
            }
        return in;
    }
}
