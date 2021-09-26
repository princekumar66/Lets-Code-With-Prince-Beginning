package begineer_Level_Exercise_1;
//Write a Java program to check whether a given integer is positive even, negative even
//positive odd or negative odd.
    import java.util.Scanner;
public class given_integer_is_positive_negative {
    public static void main (String args[]){
        System.out.println("Enter your number to check even or odd");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%2;
        if(b==0 && b>0){
            System.out.println("Positive even Integer");
        }
        else if(b==0 && b<0){
            System.out.println("Negative even Integer");
        }
        else if(b!=0 && b>0){
            System.out.println("Positive Odd Integer");
        }
        else{
            System.out.println("Negative odd Integer");
        }
    }
}
