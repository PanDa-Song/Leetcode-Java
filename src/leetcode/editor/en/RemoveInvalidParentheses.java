//Remove the minimum number of invalid parentheses in order to make the input st
//ring valid. Return all possible results. 
//
// Note: The input string may contain letters other than the parentheses ( and )
//. 
//
// Example 1: 
//
// 
//Input: "()())()"
//Output: ["()()()", "(())()"]
// 
//
// Example 2: 
//
// 
//Input: "(a)())()"
//Output: ["(a)()()", "(a())()"]
// 
//
// Example 3: 
//
// 
//Input: ")("
//Output: [""]
// Related Topics Depth-first Search Breadth-first Search


package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class RemoveInvalidParentheses {
  public static void main(String[] args) {
       Solution solution = new RemoveInvalidParentheses().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        List<String> results = new ArrayList<String>();
        int[] result = getLeftRightCount(s);
        dfs(s, 0, result[0], result[1], results);

        return results;
    }

    private void dfs(
                String s,
                int startIndex,
                int leftCount,
                int rightCount,
                List<String> results) {
        if(leftCount == 0 && rightCount == 0 && isStringValid(s)) {
            results.add(s);
            return;
        }

        for(int i = startIndex; i < s.length(); i++) {
            if(i > startIndex && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            if(leftCount > 0 && s.charAt(i) == '(') {
                dfs(s.substring(0, i) + s.substring(i + 1), i, leftCount - 1, rightCount, results);
            }

            if(rightCount > 0 && s.charAt(i) == ')') {
                dfs(s.substring(0, i) + s.substring(i + 1), i, leftCount, rightCount - 1, results);
            }
        }
    }
    private boolean isStringValid(String s) {
        int[] result = getLeftRightCount(s);
        return result[0] == 0 && result[1] == 0;
    }

    private int[] getLeftRightCount(String s) {
        int[] count = new int[]{0, 0};
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count[0]++;
            }
            if(c == ')') {
                if(count[0] > 0) {
                    count[0]--;
                } else {
                    count[1]++;
                }
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}