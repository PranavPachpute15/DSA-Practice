// Problem: 4Sum
// Platform: LeetCode
// Topic: Arrays, Two Pointers
// Difficulty: Medium
// Approach: Sort array, fix two numbers and use two pointers for the remaining pair
// Time: O(n^3) | Space: O(1) (excluding output list)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < n; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;

                while(k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum < target){
                        k++;
                    } 
                    else if(sum > target){
                        l--;
                    } 
                    else{
                        List<Integer> x = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(x);
                        k++;
                        l--;

                        while(k < l && nums[k] == nums[k - 1]) k++;
                        while(k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
            }
        }

        return ans;




        // Set<List<Integer>> set = new HashSet<>();
        // int n = nums.length;
        // for(int i = 0; i<n ; i++){
        //     for(int j = i+1;j<n ; j++){
        //         Set<Integer> set1 = new HashSet<>();
        //         for(int k = j+1 ; k<n ; k++){
                    
        //             int last = target - (nums[i]+nums[j]+nums[k]);
        //             if(set1.contains(last)){
        //                 List<Integer> x = Arrays.asList(nums[i],nums[j],nums[k],last);
        //                 Collections.sort(x);
        //                 set.add(x);
        //             }else{
        //                 set1.add(nums[k]);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
    }
}
