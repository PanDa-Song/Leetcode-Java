//Given an input string (s) and a pattern (p), implement regular expression matc
//hing with support for '.' and '*'. 
//
// 
//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.
// 
//
// The matching should cover the entire input string (not partial). 
//
// Note: 
//
// 
// s could be empty and contains only lowercase letters a-z. 
// p could be empty and contains only lowercase letters a-z, and characters like
// . or *. 
// 
//
// Example 1: 
//
// 
//Input:
//s = "aa"
//p = "a"
//Output: false
//Explanation: "a" does not match the entire string "aa".
// 
//
// Example 2: 
//
// 
//Input:
//s = "aa"
//p = "a*"
//Output: true
//Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, 
//by repeating 'a' once, it becomes "aa".
// 
//
// Example 3: 
//
// 
//Input:
//s = "ab"
//p = ".*"
//Output: true
//Explanation: ".*" means "zero or more (*) of any character (.)".
// 
//
// Example 4: 
//
// 
//Input:
//s = "aab"
//p = "c*a*b"
//Output: true
//Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, i
//t matches "aab".
// 
//
// Example 5: 
//
// 
//Input:
//s = "mississippi"
//p = "mis*is*p*."
//Output: false
// 
// Related Topics String Dynamic Programming Backtracking


package leetcode.editor.en;
public class RegularExpressionMatching {
  public static void main(String[] args) {
       Solution solution = new RegularExpressionMatching().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMatch(String s, String p) {
                if (p == null || p.length() == 0) return (s == null || s.length() == 0);

        boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for (int j=2; j<=p.length(); j++) {
            dp[0][j] = p.charAt(j-1) == '*' && dp[0][j-2];
        }

        for (int j=1; j<=p.length(); j++) {
            for (int i=1; i<=s.length(); i++) {
                if (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '.')
					dp[i][j] = dp[i-1][j-1];
                else if(p.charAt(j-1) == '*')
                    dp[i][j] = dp[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && dp[i-1][j]);
            }
        }
        return dp[s.length()][p.length()];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}