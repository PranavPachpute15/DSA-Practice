// Problem: Majority Element II
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Medium
// Approach: Boyer-Moore Voting Algorithm (extended for n/3)
// Time: O(n) | Space: O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int num1 = 0;
        int num2 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
            else if(count1 == 0){
                num1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                num2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int count11 = 0;
        int count22 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == num1) count11++;
            else if(nums[i] == num2) count22++;
        }

        if(count11 > n/3) result.add(num1);
        if(count22 > n/3) result.add(num2);

        return result;

        // for(int i = 0; i<n; i++){
        //     int count = 0;
        //     if(result.contains(nums[i])) continue;
        //     for(int j = 0;j<n ; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > n/3){
        //         result.add(nums[i]);
        //     }
        // }
        // return result;
    }
}
