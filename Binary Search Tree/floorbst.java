/*
    Time Complexity: O(N)
    Space Complexity: O(1)

    Where 'N' is the number of nodes in the given tree.
*/

public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {

        // Base case
        if (root == null) {
            return -1;
        }

        // Find the floor in left sub tree
        int leftFloor = floorInBST(root . left, X);

        // Find the floor in right sub tree
        int rightFloor = floorInBST(root . right, X);

        // Let the answer be -1
        int ans = -1;

        // If right floor is less than 'X' and but greater then left floor
        if (leftFloor <= rightFloor && rightFloor <= X) {
            ans = rightFloor;
        }

        // If left floor is less than 'X' and but greater then right floor
        if (leftFloor > rightFloor && leftFloor <= X) {
            ans = leftFloor;
        }

        // If root . data is less than 'X' and greater than 'ans' then root value is more close to 'X'
        if (root . data > ans && root . data <= X) {
            ans = root . data;
        }

        return ans;
    }
}