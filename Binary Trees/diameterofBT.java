public class diameterofBT {
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }
    int height(TreeNode node){
        if(node==null)
            return 0;
        int l= height(node.left);
        int r= height(node.right);
        
        dia= Math.max(dia,l+r);
        return 1+Math.max(l,r);
    }
}
