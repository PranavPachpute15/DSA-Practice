// Problem: Longest Subarray with Sum K
// Platform: Practice / Coding Interview
// Topic: Arrays
// Difficulty: Medium
// Approach: Brute force using two loops
// Time: O(n^2) | Space: O(1)
class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int length = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + nums[j];
                if(sum == k){
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
}
