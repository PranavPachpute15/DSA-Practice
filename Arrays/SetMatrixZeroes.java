// Problem: Set Matrix Zeroes
// Platform: LeetCode
// Topic: Arrays, Matrix
// Difficulty: Medium
// Approach: Mark rows and columns that contain zero
// Time: O(n*m) | Space: O(n + m)
class Solution {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] rows = new int[n];
        int[] column = new int[m];

        for(int i = 0;i<n; i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for(int i = 0;i<n; i++){
            for(int j = 0;j<m;j++){
                if(rows[i]==1 || column[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }

    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<m ;j++){
    //             if(matrix[i][j] == 0){
    //                 rows(matrix,m,i);
    //                 column(matrix,n,j);
    //             }
    //         }
    //     }
    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<m ;j++){
    //             if(matrix[i][j] == -11){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }
    // private void rows(int[][] matrix,int m , int i){
    //     for(int j = 0;j<m;j++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -11;
    //         }
    //     }
    // }
    // private void column(int[][] matrix,int n , int j){
    //     for(int i = 0;i<n;i++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -11;
    //         }
    //     }
    // }

    }
}
