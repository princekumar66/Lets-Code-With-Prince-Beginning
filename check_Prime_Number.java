/*Write a  program to determine whether a given number is prime or not.
 */
package begineer_Level_Exercise_1;
    import java.util.Scanner;
public class check_Prime_Number {
    public static void main(String args[]){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        if(a==1){
            System.out.println("It is not a Prime Number");
        }
        for(int i =2; i<a; i++){
            c = a%i;
            if(c==0){
                System.out.println("It is not a Prime Number");
                break;
            }
        }
        if(c!=0 || a ==2){
            System.out.println("It is a Prime Number");
        }
    }
}
