public class symmetrictree {
    public boolean isSymmetric(TreeNode root) {
        return root==null || issym(root.left,root.right);
    }
    boolean issym(TreeNode l,TreeNode r){
        if(l==null || r==null) return l==r;
        if(l.val!=r.val) return false;
        return issym(l.left,r.right) && issym(l.right,r.left);      
    }
}
