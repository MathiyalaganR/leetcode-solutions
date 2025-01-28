class Solution {
    public int arrangeCoins(int n) {
        // Initialize variables
        int left = 0, right = n;

        // Binary search to find the largest k such that k * (k + 1) / 2 <= n
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Middle value to check the sum of first 'mid' rows
            long sum = (long)mid * (mid + 1) / 2;  // Sum of first 'mid' rows
            
            if (sum == n) {  // Exact match
                return mid;
            } else if (sum < n) {  // If sum is less than n, we can try for more rows
                left = mid + 1;
            } else {  // If sum is greater than n, we need fewer rows
                right = mid - 1;
            }
        }
        
        // If no exact match, return 'right', which gives the largest valid number of rows
        return right;
    }
}
