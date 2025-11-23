// Find Sum of Numbers Entered by User
import java.util.Scanner;
class sum_of_num{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    System.out.print("Enter First Number : ");
    num1=sc.nextInt();
    System.out.print("Enter Second Number : ");
    num2=sc.nextInt();
    System.out.println("Sum of these numbers is : "+(num1+num2));

    // Sum of Numbers Entered by User
    System.out.print("Enter Number of Elements :");
    int n=sc.nextInt();
    int sum=0;
    System.out.println("Enter Elements :");
    for(int i=0;i<n;i++){
        int array=sc.nextInt();
        sum=sum+array;
    }
    System.out.println("sum of Elements numbers : "+sum);

}
}