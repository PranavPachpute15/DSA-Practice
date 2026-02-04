// Problem: Max Consecutive Ones
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Easy
// Approach: Linear scan with running count
// Time: O(n) | Space: O(1)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
