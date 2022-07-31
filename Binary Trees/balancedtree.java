public class balancedtree {
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root)!=-1;
    }
    int dfsheight(TreeNode root){
        if(root==null) return 0;
        int l=dfsheight(root.left);
        if(l==-1) return -1;
        int r=dfsheight(root.right);
        if(r==-1) return -1;
        
        if(Math.abs(l-r)>1)
            return -1;
        
        return Math.max(l,r)+1;
    }
}
