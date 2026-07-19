class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low = 0;
        int high = (matrix.length * matrix[0].length) - 1;
        int rows = matrix.length;
        int column = matrix[0].length ;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / column;
            int col = mid % column;
            int element = matrix[row][col];
            if (element == target) {
                return true;
            } else if (element > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
