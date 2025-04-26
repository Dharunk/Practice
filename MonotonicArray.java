// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

// Example 1:

// Input: nums = [1,2,2,3]
// Output: true
// Example 2:

// Input: nums = [6,5,4,4]
// Output: true
// Example 3:

// Input: nums = [1,3,2]
// Output: false
 

// Constraints:

// 1 <= nums.length <= 105
// -105 <= nums[i] <= 105




public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=1; i < nums.length; i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else if(nums[i]<nums[i-1]){
                count1++;
            }
        }
        if(count == count-count1 || count1 == count1-count){
            return true;
        }else{
             return false;
        }
    }

    public static void main(String[] args) {
        MonotonicArray ma = new MonotonicArray();
        int[] a = {4,3,4,2,1};
        System.out.println(ma.isMonotonic(a));
    }
}
