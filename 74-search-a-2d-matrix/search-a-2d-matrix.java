class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int row = 0;
        int col = matrix[0].length - 1;  // Start from top-right corner
        
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;  // Move down if the current value is smaller than target
            } else {
                col--;  // Move left if the current value is larger than target
            }
        }
        
        return false;
    }
}
