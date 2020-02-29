//Given a binary tree, return the inorder traversal of its nodes' values. 
//
// Example: 
//
// 
//Input: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//Output: [1,3,2] 
//
// Follow up: Recursive solution is trivial, could you do it iteratively? 
// Related Topics Hash Table Stack Tree


package leetcode.editor.en;

import leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
  public static void main(String[] args) {
       Solution solution = new BinaryTreeInorderTraversal().new Solution();
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if(root != null) {
            if(root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if(root.right !=null) {
                helper(root.right, res);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}