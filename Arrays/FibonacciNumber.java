// Problem: Fibonacci Number
// Platform: LeetCode
// Topic: Recursion
// Difficulty: Easy
// Approach: Simple recursion
// Time: O(2^n) | Space: O(n) (recursion stack)
class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
