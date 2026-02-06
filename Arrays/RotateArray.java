// Problem: Rotate Array
// Platform: LeetCode
// Topic: Arrays
// Difficulty: Medium
// Approach: Reverse the array in parts
// Time: O(n) | Space: O(1)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, d - 1);
        reverse(nums, d, n - 1);
    }

    private void reverse(int arr[], int l, int r) {
        while (l < r) {
            int t = arr[l];
            arr[l++] = arr[r];
            arr[r--] = t;
        }
    }
}
