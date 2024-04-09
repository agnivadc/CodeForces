import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of items and knapsack capacity
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        // Array to store weights and values of items
        int[] weights = new int[N];
        int[] values = new int[N];

        // Reading weights and values of items
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        // Call the recursive function to find the maximum possible sum of values
        int maxSum = knapsack(N, W, weights, values);

        // Output the result
        System.out.println(maxSum);

        scanner.close();
    }

    public static int knapsack(int N, int W, int[] weights, int[] values) {
        // Base case: if there are no items left or knapsack capacity is 0
        if (N == 0 || W == 0) {
            return 0;
        }

        // If weight of current item exceeds knapsack capacity, skip it
        if (weights[N - 1] > W) {
            return knapsack(N - 1, W, weights, values);
        }

        // Recursive call:
        // 1. Include the current item
        // 2. Exclude the current item
        return Math.max(values[N - 1] + knapsack(N - 1, W - weights[N - 1], weights, values),
                        knapsack(N - 1, W, weights, values));
    }
}
