//You are a product manager and currently leading a team to develop a new produc
//t. Unfortunately, the latest version of your product fails the quality check. Si
//nce each version is developed based on the previous version, all the versions af
//ter a bad version are also bad. 
//
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first
// bad one, which causes all the following ones to be bad. 
//
// You are given an API bool isBadVersion(version) which will return whether ver
//sion is bad. Implement a function to find the first bad version. You should mini
//mize the number of calls to the API. 
//
// Example: 
//
// 
//Given n = 5, and version = 4 is the first bad version.
//
//call isBadVersion(3) -> false
//call isBadVersion(5) -> true
//call isBadVersion(4) -> true
//
//Then 4 is the first bad version. 
// 
// Related Topics Binary Search


package leetcode.editor.en;
public class FirstBadVersion {
  public static void main(String[] args) {
       Solution solution = new FirstBadVersion().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
class  VersionControl {
    boolean isBadVersion(int version){
        return false;
    };
}
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 0){
            return -1;
        }
        int start = 1;
        int end = n;
        int mid = 0;
        while(start < end){
            mid = start + (end - start) / 2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}