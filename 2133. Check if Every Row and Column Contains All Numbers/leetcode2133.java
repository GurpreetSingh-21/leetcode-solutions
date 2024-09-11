import java.util.HashSet;

public class leetcode2133 {

    static class Solution {
        public boolean checkValid(int[][] matrix) {
            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                HashSet<Integer> row = new HashSet<>();
                HashSet<Integer> col = new HashSet<>();
                
                for (int j = 0; j < n; j++) {
                    // Check rows
                    if (!row.add(matrix[i][j])) {
                        return false;
                    }
                    // Check columns
                    if (!col.add(matrix[j][i])) {
                        return false;
                    }
                }
            }
            
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] matrix1 = {
            {1, 2, 3},
            {3, 1, 2},
            {2, 3, 1}
        };
        
        int[][] matrix2 = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };
        
        System.out.println("Matrix 1 is valid: " + solution.checkValid(matrix1)); // Should print true
        System.out.println("Matrix 2 is valid: " + solution.checkValid(matrix2)); // Should print false
    }
}
