/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=0;
        int curSum=0;
        for(int i=0;i<nums.length;i++)
        {
        curSum+=nums[i];
       if(curSum>maxSum)
       {
        maxSum=curSum;
       }
       if(curSum<0)
       curSum=0;
    }
    return maxSum;
    }
}
// @lc code=end
