import java.io.*;
import java.util.*;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            boolean flag = isPrime(n);
            System.out.println(flag ? "Prime" : "Not prime");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}