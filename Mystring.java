import java.util.*;
class Mystring{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String rev = "";
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("String Reverse is: " + rev);
    }
}