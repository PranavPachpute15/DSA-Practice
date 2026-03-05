// Problem: 3Sum
// Platform: LeetCode
// Topic: Arrays, Two Pointers
// Difficulty: Medium
// Approach: Sort array and use two pointers while skipping duplicates
// Time: O(n^2) | Space: O(1) (excluding output list)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> x = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(x);
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ans;



        // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         for(int k = j+1; k<n ; k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> x = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(x);
        //                 set.add(x);
        //             }
        //         }
        //     }
        // }
        // ArrayList<List<Integer>> result = new ArrayList<>();
        // result.addAll(set);
        // return new ArrayList<>(set);




        // Set<List<Integer>> set = new HashSet<>();
        // int n = nums.length;
        // for(int i=0; i< n ;i++){
        //     Set<Integer> set1 = new HashSet<>();
        //     for (int j=i+1 ;j<n ;j++){
        //         int third = -(nums[i]+nums[j]);
        //         if(set1.contains(third)){
        //             List<Integer> x= Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(x);
        //             set.add(x);
        //         }
        //         set1.add(nums[j]);   
        //     }
        // }
        // return new ArrayList<>(set);
    }
}
