//Given a string, find the length of the longest substring without repeating cha
//racters. 
//
// 
// Example 1: 
//
// 
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 
// 
//
// 
// Example 2: 
//
// 
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// 
// Example 3: 
//
// 
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
//             Note that the answer must be a substring, "pwke" is a subsequence
// and not a substring.
// 
// 
// 
// 
// Related Topics Hash Table Two Pointers String Sliding Window


package leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
       Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> window = new HashSet<>();
        int res = 0;
        int i = 0, j = 0;
        while(i < n && j < n) {
            if(!window.contains(s.charAt(j))){
                window.add(s.charAt(j++));
                res = Math.max(res, j - i);
            }
            else {
                window.remove(s.charAt(i++));
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}