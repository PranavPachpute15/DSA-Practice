// Problem: Rotate Image
// Platform: LeetCode
// Topic: Arrays, Matrix
// Difficulty: Medium
// Approach: Use an extra matrix to place rotated elements
// Time: O(n^2) | Space: O(n^2)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result[j][n - i - 1] = matrix[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
}
