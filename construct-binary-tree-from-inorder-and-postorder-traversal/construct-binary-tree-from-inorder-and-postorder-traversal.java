/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int postLength = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postLength = postorder.length - 1;

        return buildTree(inorder, 0, inorder.length - 1, postorder);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder) {

        // Base case
        if (inStart > inEnd) return null;

        // Find the root node from the last element of postorder traversal
        int rootVal = postorder[postLength--];
        TreeNode root = new TreeNode(rootVal);

        // Find the index of the root node in inorder traversal
        int rootIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        // Recursively build the left and right subtrees
        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder);
        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder);

        return root;
    }
}