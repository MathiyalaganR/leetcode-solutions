class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;  // This will store the result
        // Loop through each number in the list
        for (int i = 0; i < nums.size(); i++) {
            int c = 0;  // Reset the count for each number
            // Convert the current number to a binary string
            String str = Integer.toBinaryString(i);
            // Count the number of 1's in the binary representation
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    c++;
                }
            }
            // If the count of 1's is equal to k, add the number to the answer
            if (c == k) {
                ans += nums.get(i);
            }
        }
        return ans;  // Return the final sum
    }
}
