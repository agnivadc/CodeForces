import java.io.IOException;
import java.util.Scanner;

public class ThreeNOneSequence {

    static long solver(int n) {
        if (n == 1) {
            return 1;
        } 
        if(n%2==1) {
            return 1 +  solver(3*n + 1);
        }
        else{
            return 1 + solver(n/2);
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        // Input
        int N = scanner.nextInt();

        // Calculate result
        long result = solver(N);

        // Output
        System.out.println(result);
    }
    
}
