public class zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList <TreeNode>();
        List < List < Integer >> wrapList = new ArrayList <List<Integer>>();

        if (root == null) return wrapList;
        q.offer(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> row= new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode node=q.peek();
                int index= i;
                 if (flag == true) row.add(q.poll().val);
                else row.add(0, q.poll().val);
                
                if(node.left!= null){
                    q.offer(node.left);
                }
                if(node.right!= null){
                    q.offer(node.right);
                }
        }
            flag=!flag;
            wrapList.add(row);
        }
        return wrapList;
    }
}
