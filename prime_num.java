// Find Prime Numbers in Java
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        // 0, 1, and negative numbers are not prime
        if (n <= 1) {
            isPrime = false;
        } else {
            // check divisibility from 2 to √n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is Not a Prime Number.");
    }
}
