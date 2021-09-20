package begineer_Level_Exercise_1;
// Write a Java program that swaps two numbers without using third variable.
    import java.util.Scanner;
public class swap_the_number_without_third_variable {
    public static void main(String args[]){
        System.out.println("Enter your first digit for swapping");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter your second digit for swapping");
        int b = sc.nextInt();
        System.out.print("Your no. after swapping " + ((a+b)-a) + ((a+b)-b));
    }
}
