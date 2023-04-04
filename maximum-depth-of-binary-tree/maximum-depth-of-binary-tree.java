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
    public int maxDepth(TreeNode root) {
		return maxDepth(root, 0);
	}

	private int maxDepth(TreeNode root, int depth) {
		if (root == null)
			return depth;

		int curDepth = depth + 1;

		int maxDepthOfLeft = maxDepth(root.left, curDepth);
		int maxDepthOfRight =  maxDepth(root.right, curDepth);

		return Math.max(maxDepthOfLeft, maxDepthOfRight);
	}
}