//Suppose an array sorted in ascending order is rotated at some pivot unknown to
// you beforehand. 
//
// (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]). 
//
// Find the minimum element. 
//
// You may assume no duplicate exists in the array. 
//
// Example 1: 
//
// 
//Input: [3,4,5,1,2] 
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: [4,5,6,7,0,1,2]
//Output: 0
// 
// Related Topics Array Binary Search


package leetcode.editor.en;
public class FindMinimumInRotatedSortedArray {
  public static void main(String[] args) {
       Solution solution = new FindMinimumInRotatedSortedArray().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMin(int[] nums) {
    if (nums.length == 0 || nums == null){
      return -1;
    }
    int end = nums.length - 1;
    int start = 0;
    while (start + 1 < end){
      int mid  = start + (end - start) / 2;
      if (nums[mid] < nums[end]){
        end = mid;
      }else{
        start = mid;
      }
    }
    if (nums[start] < nums[end]){
      return nums[start];
    }
    return nums[end];
  }
}
//leetcode submit region end(Prohibit modification and deletion)

}