public class maxpathsum {
    int maxvalue=Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root) {
        maxpath(root);
        return maxvalue;
    }
    int maxpath(TreeNode node){
        if(node==null)  return 0;
        int l=Math.max(0,maxpath(node.left));
        int r=Math.max(0,maxpath(node.right));
        
        maxvalue= Math.max(maxvalue,l+r+node.val);
        return Math.max(l,r)+node.val;
    }
}
