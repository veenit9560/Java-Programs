/*
Reverse words in String java program to take input string by users
 */
import java.util.Scanner;
public class WordReverse {
    public static void main(String[] args) {


        String str;
//        its a input for scanner initialize function
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String :");
        str=in.nextLine();

        String[] splitArray=str.split(" ");
        for (int i=splitArray.length-1;i>=0;i--){
            System.out.print(splitArray[i] + " ");
        }

    }
}
 