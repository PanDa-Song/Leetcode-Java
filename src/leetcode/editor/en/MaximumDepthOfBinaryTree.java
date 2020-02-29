//Given a binary tree, find its maximum depth. 
//
// The maximum depth is the number of nodes along the longest path from the root
// node down to the farthest leaf node. 
//
// Note: A leaf is a node with no children. 
//
// Example: 
//
// Given binary tree [3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7 
//
// return its depth = 3. 
// Related Topics Tree Depth-first Search


package leetcode.editor.en;

import leetcode.TreeNode;

public class MaximumDepthOfBinaryTree {
  public static void main(String[] args) {
       Solution solution = new MaximumDepthOfBinaryTree().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int leftDepth;
        int rightDepth;
        if (root.left == null){
            leftDepth = 0;
        } else {
            leftDepth = maxDepth(root.left);
        }
        if (root.right == null){
            rightDepth = 0;
        } else {
            rightDepth = maxDepth(root.right);
        }
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}