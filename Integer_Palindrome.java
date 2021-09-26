/*Write a program in Java to check whether a number is a palindrome or not.*/
package begineer_Level_Exercise_1;
    import java.util.Scanner;
public class Integer_Palindrome {
    public static void main (String args[]){
        System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = a;
        int e = a;
        int b = 0;
        int i =0;
        while (true){
            int c = a%10;
            b = b+1;
            a = a/10;
            i++;
            if(a==0){
                break;
            }
        }
        int reverse = 0;
        int remainder = 0;
        for(int j = 0; j<b; j++){
            remainder = d % 10;
            reverse = reverse*10 + remainder;
            d = d/10;
        }
        if(reverse==e){
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}
