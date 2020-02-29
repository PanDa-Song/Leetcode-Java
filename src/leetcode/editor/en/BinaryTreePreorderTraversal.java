//Given a binary tree, return the preorder traversal of its nodes' values. 
//
// Example: 
//
// 
//Input: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//Output: [1,2,3]
// 
//
// Follow up: Recursive solution is trivial, could you do it iteratively? 
// Related Topics Stack Tree


package leetcode.editor.en;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
  public static void main(String[] args) {
       Solution solution = new BinaryTreePreorderTraversal().new Solution();
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> toVisit = new Stack<TreeNode>();
        toVisit.push(root);
        while (toVisit.empty() == false){
            TreeNode visiting = toVisit.pop();
            result.add(visiting.val);
            if (visiting.right != null){
                toVisit.push(visiting.right);
                }
            if (visiting.left != null){
                toVisit.push(visiting.left);
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}