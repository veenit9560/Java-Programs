import java.util.Scanner;

public class sum_nth_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n=sc.nextInt();
        int sum=(n*(n+1))/2;
        System.out.println("sum of first n numbers : "+sum);
    }
}
