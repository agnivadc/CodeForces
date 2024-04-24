import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 

        int result = findBits(t);
        System.out.println(result);
        
    }

    public static int findBits(int a) {
        int count = 0;
        while(a>0){
            if((a&1)==1)
                count++;
            a >>= 1;
        }
        return count;
    }
}
