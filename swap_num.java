import java.util.Scanner;

public class swap_num {
 public static void withusingthirdvariable(int a, int b) {
        // Swapping the values with third variable 
        int temp = a;
        a = b;
        b= temp;

        System.out.println("Swap Number 1 : "+a);
        System.out.println("Swap Number 2 : "+b);
    }

     public static void withoutusingthirdvariable(int a, int b){
        // Swapping the values with out third  variable 
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Swap Number 1 : "+a);
        System.out.println("Swap Number 2 : "+b);

     }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Swap Two Numbers With Using Third Variable and Without Using Third Variable : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Original Number 1 : "+num1);
        System.out.println("Original Number 2 : "+num2);
        
        System.out.println("Select a Swap Number type (1 or 2):");
        System.out.println("1. With Using Third Variable");
        System.out.println("2. Without Using Third Variable");
        int swptyp=scan.nextInt();

        switch (swptyp) {
            case 1:
                withusingthirdvariable(num1,num2);
                break;

            case 2:
                withoutusingthirdvariable(num1,num2);
                break;
        
            default:
            System.out.println("Invalid Swap Numbers Type");
                break;
        }
        
    }
}
