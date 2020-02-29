package leetcode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append(val);
        if (right != null) {
            sb.append("->").append(right);
        }
        if (left != null) {
            sb.append("->").append(left);
        }
        return sb.toString();
    }
}
