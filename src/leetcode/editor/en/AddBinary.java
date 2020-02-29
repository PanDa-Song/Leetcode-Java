//Given two binary strings, return their sum (also a binary string). 
//
// The input strings are both non-empty and contains only characters 1 or 0. 
//
// Example 1: 
//
// 
//Input: a = "11", b = "1"
//Output: "100" 
//
// Example 2: 
//
// 
//Input: a = "1010", b = "1011"
//Output: "10101" 
// Related Topics Math String


package leetcode.editor.en;
public class AddBinary {
  public static void main(String[] args) {
       Solution solution = new AddBinary().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry; //carry means 进位
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            //we subtract '0' to get the int value of the char from the ascii
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}