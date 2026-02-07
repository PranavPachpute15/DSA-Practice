// Problem: 3Sum
// Platform: LeetCode
// Topic: Arrays, Hashing
// Difficulty: Medium
// Approach: Fix one element and use HashSet to find remaining two
// Time: O(n^2) | Space: O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            Set<Integer> set1 = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int third = -(nums[i] + nums[j]);
                if(set1.contains(third)){
                    List<Integer> x = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(x);
                    set.add(x);
                }
                set1.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}
