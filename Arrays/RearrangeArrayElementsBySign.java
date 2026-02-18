// Problem: Rearrange Array Elements by Sign
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Medium
// Approach: Place positives at even indices and negatives at odd indices
// Time: O(n) | Space: O(n)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int pos = 0;
        int neg = 1;
        
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;

        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
        // for(int i = 0; i<n ; i++){
        //     if(nums[i]>0){
        //         pos.add(nums[i]);
        //     }else{
        //         neg.add(nums[i]);
        //     }
        // }
        // int j = 0;
        // for(int i = 0;i<n ;i+=2){
        //     ans[i] = pos.get(j);
        //     j++;
        // }
        // int k = 0;
        // for(int i = 1;i<n ;i+=2){
        //     ans[i] = neg.get(k);
        //     k++;
        // }
        // return ans;
    }
}
