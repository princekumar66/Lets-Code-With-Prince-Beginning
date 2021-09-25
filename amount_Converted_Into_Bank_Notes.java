package begineer_Level_Exercise_1;
// Write a Java program to read an amount (integer value) and break the amount
// into smallest possible number of bank notes.
import java.util.Scanner;
public class amount_Converted_Into_Bank_Notes {
    public static void main (String args[]){
        System.out.println("Enter your number to convert into note denomination");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/100;
        int c = a%100;
        int d = c/50;
        int e = c%50;
        int f = e/10;
        int g = e%10;
        int h = g/5;
        int i = g%5;
        int j = i/2;
        int k = i%2;
        int l = k/1;
        System.out.print(b + " Note(s) of 100 " + d + " Note(s) of 50 " + f + " Note(s) of 10 ");
        System.out.println(h + " Note(s) of 5 " + j + " Note(s) of 2 " + l + " Note(s) of 1 ");
    }
}
