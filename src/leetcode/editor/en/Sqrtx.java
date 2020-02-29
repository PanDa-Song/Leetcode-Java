//Implement int sqrt(int x). 
//
// Compute and return the square root of x, where x is guaranteed to be a non-ne
//gative integer. 
//
// Since the return type is an integer, the decimal digits are truncated and onl
//y the integer part of the result is returned. 
//
// Example 1: 
//
// 
//Input: 4
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since 
//             the decimal part is truncated, 2 is returned.
// 
// Related Topics Math Binary Search


package leetcode.editor.en;
public class Sqrtx {
  public static void main(String[] args) {
       Solution solution = new Sqrtx().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        while(start < end){
            int mid = (start + end) / 2;
            if(mid <= x / mid && (mid + 1) > x / (mid + 1)){
                return mid;
            }
            else if(mid > x / mid){
                end = mid;
            }
            else
                start = mid + 1;
        }
        return 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}