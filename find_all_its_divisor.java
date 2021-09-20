package begineer_Level_Exercise_1;
//Write a Java program that reads an integer and find all its divisor.
    import java.util.Scanner;
public class find_all_its_divisor {
    public static void main (String args[]){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a; i>=1; i--){
            int b = a%i;
            int c = a/i;
            if(b==0){
                System.out.print(c + " ");
            }
        }
    }
}
