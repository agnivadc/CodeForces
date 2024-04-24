import java.util.Scanner;

public class XORwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // Find the smallest possible value
            int result = findSmallestValue(a, b);
            System.out.println(result);
        }
    }

    public static int findSmallestValue(int a, int b) {
        int x = a ^ b; // x contains all the bits that are set in either a or b but not in both
        return x;
    }
}
