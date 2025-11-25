// Reverse integer number
public class ReverseInteger {

    public static int reverse(int num) {
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Add the digit to the reversed number
            num /=10; // Remove the last digit from the original number
        }

        return reversedNum;
    }
    public static void main(String[] args) {
        int originalNumber = 120;
        int reversed = reverse(originalNumber);
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversed); 

        int negativeNumber = -6789;
        int reversedNegative = reverse(negativeNumber);
        System.out.println("Original Negative Number: " + negativeNumber);
        System.out.println("Reversed Negative Number: " + reversedNegative); // Output: -9876 (Note: This simple method handles negative numbers by reversing the absolute value and keeping the sign if needed externally)
    }
}