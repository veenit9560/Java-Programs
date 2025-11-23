// java program to add digits in a number

import java.util.Scanner;

public class add_digit_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits : ");
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            int lastdigit=num%10;
            num=num/10;
            sum=sum+lastdigit;
        }
        System.out.println("Sum of Digits Numbers : "+sum);
    }
    
}
