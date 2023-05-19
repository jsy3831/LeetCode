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
class BSTIterator {

    private int pointer;
    private final List<Integer> inorderList;
    public BSTIterator(TreeNode root) {
        this.pointer = 0;
        this.inorderList = new ArrayList<>();

        inorder(root);
    }

    public int next() {
        if (inorderList.size() <= pointer) return -1;
        return inorderList.get(pointer++);
    }

    public boolean hasNext() {
        return inorderList.size() > pointer;
    }

    private void inorder(TreeNode cur) {
        if (cur == null) return;

        inorder(cur.left);
        inorderList.add(cur.val);
        inorder(cur.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */