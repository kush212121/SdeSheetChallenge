public class levelorder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wraplist = new ArrayList<List<Integer>>();
        Queue <TreeNode> q= new LinkedList<>();
        if(root == null){
            return wraplist;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levnum=q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<levnum;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                sublist.add(q.poll().val);
        }
            wraplist.add(sublist);
            
        }
        return wraplist;
    }
}
