//Suppose an array sorted in ascending order is rotated at some pivot unknown to
// you beforehand. 
//
// (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]). 
//
// You are given a target value to search. If found in the array return its inde
//x, otherwise return -1. 
//
// You may assume no duplicate exists in the array. 
//
// Your algorithm's runtime complexity must be in the order of O(log n). 
//
// Example 1: 
//
// 
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// 
//
// Example 2: 
//
// 
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1 
// Related Topics Array Binary Search


package leetcode.editor.en;
public class SearchInRotatedSortedArray {
  public static void main(String[] args) {
       Solution solution = new SearchInRotatedSortedArray().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {  // eg. 3,4,5,6,1,2
                if (target > nums[mid] || target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }
            else {  // eg. 5,6,1,2,3,4
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }
        }
        if (start == end && target != nums[start]) return -1;
        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}