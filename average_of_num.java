// java program to Find Average of Numbers Entered by User

import java.util.Scanner;

public class average_of_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the count of number : ");
        int n=sc.nextInt();
        System.out.println("Entered Numbers : ");
        int sum=0, average=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            sum=sum+num;
        }
        average=sum/n;
        System.out.println("Average of entered of numbers : "+average);
    }
}
