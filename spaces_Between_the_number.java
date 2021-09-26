package begineer_Level_Exercise_1;
// Write a Java program that accepts one seven-digit number and separates the
// into its individual digits, and prints the digits separated from one another
// by two spaces each.
    import java.util.Scanner;
public class spaces_Between_the_number {
    public static void main (String args[]){
        System.out.println("Enter your seven digit number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int c = 10000000;
       /* for (int i=0; i>0; i++) {
            c = c/10;
            a = a / c;
            System.out.println(a+ "  ");
            a = a

        }*/
        System.out.println(c);
    }
}
