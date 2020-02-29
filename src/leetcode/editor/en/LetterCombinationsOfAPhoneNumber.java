//Given a string containing digits from 2-9 inclusive, return all possible lette
//r combinations that the number could represent. 
//
// A mapping of digit to letters (just like on the telephone buttons) is given b
//elow. Note that 1 does not map to any letters. 
//
// 
//
// Example: 
//
// 
//Input: "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
// 
//
// Note: 
//
// Although the above answer is in lexicographical order, your answer could be i
//n any order you want. 
// Related Topics String Backtracking


package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
  public static void main(String[] args) {
       Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits==null||digits.length()==0) return ans;

        char[][] map = new char[8][];
        map[0]="abc".toCharArray();
        map[1]="def".toCharArray();
        map[2]="ghi".toCharArray();
        map[3]="jkl".toCharArray();
        map[4]="mno".toCharArray();
        map[5]="pqrs".toCharArray();
        map[6]="tuv".toCharArray();
        map[7]="wxyz".toCharArray();

        char[] input = digits.toCharArray();
        ans.add("");
        for(char c:input)
            ans=expand(ans,map[c-'2']);
        return ans;


    }

    private List<String> expand(List<String> l,char[] arr)
    {
        List<String> next = new ArrayList<String>();
        for(String s:l)
            for(char c:arr)
                next.add(s+c);
        return next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}