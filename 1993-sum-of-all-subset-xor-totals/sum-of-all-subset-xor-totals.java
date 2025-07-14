class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 1 << n; // 2^n subsets
        int totalXORSum = 0;

        for (int i = 0; i < total; i++) {
            int xor = 0;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j]; // XOR instead of sum
                }
            }

            totalXORSum += xor;
        }
        return totalXORSum;
    }
}