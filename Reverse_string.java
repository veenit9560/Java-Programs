// Reverse a String in Java

public class Reverse_string {
    public static void main(String[] args) {
        String str ="abcvd";
        String reversestr=" ";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            reversestr=ch+reversestr;
        }
        System.out.println("Reversed String is : "+reversestr);
    }
}
