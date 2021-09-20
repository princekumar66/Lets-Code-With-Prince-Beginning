package begineer_Level_Exercise_1;
//Write a java program that accepts one seven-digit number and separates the number into its
// individual digits, and prints the digits separated from one another by two spaces each.
    import java.util.Scanner;
public class space_Between_Integer {
    public static void main(String args[]){
        System.out.println("Enter your number");
        Scanner sc = new Scanner (System.in);
        int b = sc.nextInt();
        int rev = 0;
        int remainder = 0;
        for(int i = 0; i<7; i++){
            remainder = b % 10;
            rev = rev*10 + remainder;
            b = b/10;
        }
        for(int i = 0; i<7; i++){
            int c = rev % 10;
            System.out.print(c+ "  ");
            rev = rev/10;
        }
    }
}
