// Problem: Pascal's Triangle
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Easy
// Approach: Build each row using previous value (nCr logic)
// Time: O(n^2) | Space: O(n^2)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            ans.add(IntinRows(i));
        }
        return ans;
    }
    private List<Integer> IntinRows(int row){
        int ans= 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i < row;i++){
            ans= ans * (row-i);
            ans= ans/i;
            list.add(ans);
        }
        return list;
    }
}
