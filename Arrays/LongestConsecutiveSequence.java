// Problem: Longest Consecutive Sequence
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Medium
// Approach: Sort the array and count consecutive elements
// Time: O(n log n) | Space: O(1)
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int n = nums.length;
        Arrays.sort(nums);

        int currcount = 1;
        int longseq = 1;

        for(int i = 1; i < n; i++){
            if(nums[i - 1] == nums[i]){
                continue;
            }
            else if(nums[i] == nums[i - 1] + 1){
                currcount++;
            }
            else{
                currcount = 1;
            }
            longseq = Math.max(longseq, currcount);
        }
        return longseq;
    }
}
