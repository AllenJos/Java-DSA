import java.util.*;

/**
 * Print the given 2d matrix in spiral form.
 *
 * For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
 * a. First row(left to right)
 * b. Last column(top to bottom)
 * c. Last row(right to left)
 * d. First column(bottom to top)
 *  Mind that every element will be printed only once.
 */
class SpiralForm{

    // Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0)
            return ans;

        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;

        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];

            if (0 <= cr && cr < m && 0 <= cc && cc < n
                    && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // Function call
        System.out.println(spiralOrder(a));
    }
}