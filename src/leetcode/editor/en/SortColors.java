//Given an array with n objects colored red, white or blue, sort them in-place s
//o that objects of the same color are adjacent, with the colors in the order red,
// white and blue. 
//
// Here, we will use the integers 0, 1, and 2 to represent the color red, white,
// and blue respectively. 
//
// Note: You are not suppose to use the library's sort function for this problem
//. 
//
// Example: 
//
// 
//Input: [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2] 
//
// Follow up: 
//
// 
// A rather straight forward solution is a two-pass algorithm using counting sor
//t. 
// First, iterate the array counting number of 0's, 1's, and 2's, then overwrite
// array with total number of 0's, then 1's and followed by 2's. 
// Could you come up with a one-pass algorithm using only constant space? 
// 
// Related Topics Array Two Pointers Sort


package leetcode.editor.en;
public class SortColors {
  public static void main(String[] args) {
       Solution solution = new SortColors().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
        int m = 0;
        int n = nums.length - 1;
        int index = 0;
        while (index <= n) {
            if (nums[index] == 0) {
                nums[index] = nums[m];
                nums[m] = 0;
                m++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[n];
                nums[n] = 2;
                n--;
                index--;
            }
            index++;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}