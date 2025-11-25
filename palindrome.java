// java program for plindrome number

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int reversenum=0, temp=num;
        while (temp>0) {
            int remainder=temp%10;
            reversenum=reversenum*10+remainder;
            temp=temp/10;
        }
        if (num==reversenum) {
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
