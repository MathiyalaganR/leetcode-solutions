class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] a = new int[nums.length / 2];
        int[] b = new int[nums.length / 2];
        int[] c = new int[nums.length];
        int j = 0, k = 0;

        // Split nums into even and odd arrays
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                a[j] = nums[i];
                j++;
            } else {
                b[k] = nums[i];
                k++;
            }
        }

        // Merge the even and odd numbers into c in alternating positions
        j = 0;  // Reuse j as the index for the final array
        for (int i = 0; i < nums.length / 2; i++) {
            c[j++] = a[i];  // Even number from a
            c[j++] = b[i];  // Odd number from b
        }

        return c;
    }
}
