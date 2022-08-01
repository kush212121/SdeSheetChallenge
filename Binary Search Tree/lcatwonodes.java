/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    where 'N' is the total number of nodes of the BST.
*/

public class Solution 
{   
    public static TreeNode<Integer> lca ;
    private static int findLCA(TreeNode<Integer> currNode, TreeNode<Integer> p, TreeNode<Integer> q) 
    {   
        if (currNode == null) 
        {
            return 0;
        }

        int isTrueLeft = findLCA(currNode.left, p, q);
        int isTrueRight = findLCA(currNode.right, p, q);
        int isTrue = 0;

        if (currNode.data == p.data) 
        {
            isTrue++;
        }

        if (currNode.data == q.data) 
        {
            isTrue++;
        }

        // Current Node is the LCA
        if ((isTrueLeft + isTrueRight + isTrue) >= 2) 
        {
            lca = currNode;
        }
        
        if ((isTrueLeft + isTrueRight + isTrue) > 0) 
        {
            return 1;
        }
      
        return 0;
    }

    public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {   
        lca = null;
		findLCA(root, p, q);
		return lca;
	}
}