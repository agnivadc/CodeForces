import java.io.IOException;
import java.util.Scanner;

public class Factorial {
    // Function to calculate factorial recursively
    static int factorial(int n) {
        if (n==0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        // Input
        int N = scanner.nextInt();

        // Calculate factorial of N
        long result = factorial(N);

        // Output
        System.out.println(result);
    }
}
