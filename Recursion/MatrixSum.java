import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows and columns
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        // Input: matrices A and B
        int[][] A = new int[R][C];
        int[][] B = new int[R][C];

        // Reading matrix A
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Reading matrix B
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Calling the recursive function to compute and print the sum of matrices A and B
        matrixSum(R, C, A, B);

        scanner.close();
    }

    public static void matrixSum(int R, int C, int[][] A, int[][] B) {
        if (R == 0) { // Base case: no more rows to process
            return;
        }

        // Calculate the sum of the current row
        int[] rowSum = new int[C];
        for (int j = 0; j < C; j++) {
            rowSum[j] = A[R-1][j] + B[R-1][j];
        }

        // Recursive call to process the next row
        matrixSum(R-1, C, A, B);
        
        // Print the sum of the current row
        for (int sum : rowSum) {
            System.out.print(sum + " ");
        }
        System.out.println();

        
    }
    
}
