class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.num=num;
        this.node=node;
    }
}
public class maxwidth {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int maxwidth=0;
        Queue<Pair> q =new LinkedList<>();
        q.offer(new Pair(root,0));    
        while(!q.isEmpty()){
            int size=q.size(); 
            int min = q.peek().num;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                int cur=q.peek().num-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first =cur;
                if(i==size-1) last=cur; 
                if(node.left!=null) q.offer(new Pair(node.left,(cur*2+1)));
                if(node.right!=null) q.offer(new Pair(node.right,(cur*2+2)));
              }
           maxwidth=Math.max(maxwidth,last-first+1);
        }
        return maxwidth;
    }
}
