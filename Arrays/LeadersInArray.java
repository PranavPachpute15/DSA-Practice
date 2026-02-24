// Problem: Leaders in an Array
// Platform: Practice / Coding Interview
// Topic: Arrays
// Difficulty: Medium
// Approach: Traverse from right and track maximum
// Time: O(n) | Space: O(n)
class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] >= max){
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
