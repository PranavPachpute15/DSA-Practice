// Problem: Single Number
// Platform: LeetCode
// Topic: Arrays, Bit Manipulation
// Difficulty: Easy
// Approach: XOR operation (a ^ a = 0, a ^ 0 = a)
// Time: O(n) | Space: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int el = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }
        // }
        // for(Integer count : map.keySet()){
        //     if(map.get(count) == 1){
        //         el = count;
        //     }
        // }
        // return el;

        int xor = 0;
        for(int i = 0 ; i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
