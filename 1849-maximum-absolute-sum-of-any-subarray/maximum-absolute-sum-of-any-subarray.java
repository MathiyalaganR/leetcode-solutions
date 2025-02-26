class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // Initialize variables for the maximum and minimum subarray sums
        int maxSum = 0;
        int minSum = 0;
        
        // Initialize variables to track the current subarray sum (both positive and negative)
        int currentMax = 0;
        int currentMin = 0;

        // Iterate through the array to compute maximum and minimum subarray sums
        for (int num : nums) {
            // Update the current maximum and minimum subarray sums
            currentMax = Math.max(num, currentMax + num);
            currentMin = Math.min(num, currentMin + num);
            
            // Update the overall maximum and minimum sums encountered so far
            maxSum = Math.max(maxSum, currentMax);
            minSum = Math.min(minSum, currentMin);
        }
        
        // The result is the maximum of the absolute values of maxSum and minSum
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
