package begineer_Level_Exercise_1;
//Write a Java program to print all numbers between 1 to 100 which divided by a
//specified number and the remainder will be 3.
    import java.util.Scanner;
public class divided_by_specified_no_leaves_remainder {
    public static void main (String args[]){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        while(i>=0){
            int b = a*i + 3;
            if(b>=100){
                break;
            }
            System.out.println(b+" ");
            i++;

        }
    }
}
