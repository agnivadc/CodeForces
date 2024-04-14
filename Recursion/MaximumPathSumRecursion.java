import java.util.Scanner;

public class MaximumPathSumRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows and columns
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Input: matrix A
        int[][] A = new int[N][M];

        // Reading matrix A
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Finding and printing the maximum path sum
        System.out.println(maxPathSum(0, 0, N, M, A));

        scanner.close();
    }

    public static int maxPathSum(int i, int j, int N, int M, int[][] A) {
        // Base case: if current position is the bottom-right cell, return its value
        if (i == N - 1 && j == M - 1) {
            return A[i][j];
        }
        
        // Initialize the maximum sum to negative infinity
        int maxSum = Integer.MIN_VALUE;

        // Explore the downward path if it's within bounds
        if (i + 1 < N) {
            int down = maxPathSum(i + 1, j, N, M, A);
            maxSum = Math.max(maxSum, A[i][j] + down);
        }

        // Explore the rightward path if it's within bounds
        if (j + 1 < M) {
            int right = maxPathSum(i, j + 1, N, M, A);
            maxSum = Math.max(maxSum, A[i][j] + right);
        }

        return maxSum;
    }
}
