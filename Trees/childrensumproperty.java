public class childrensumproperty {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        if(root==null) return;
        int l=0;
        int r=0;
        if(root.left!=null)
           l=root.left.data;
        if(root.right!=null)
           r=root.right.data;
        int cur=root.data;
        if(cur<l+r){
            cur=l+r;
            root.data=cur;
        }
        else if(cur>l+r){
            if( root.left!=null)
              root.left.data=cur;
            if( root.right!=null)
              root.right.data=cur;
        }
        changeTree(root.left);
        changeTree(root.right);
        l=0;
        r=0;
        if(root.left!=null)
           l=root.left.data;
        if(root.right!=null)
           r=root.right.data;
        if(root.left!=null || root.right!=null)
           root.data=l+r;
        
        // Write your code here.
    }
}
