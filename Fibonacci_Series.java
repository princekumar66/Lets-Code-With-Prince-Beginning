/*Write a program in Java to display the first n terms of Fibonacci Series.
 */
package begineer_Level_Exercise_1;
    import java.util.Scanner;
public class Fibonacci_Series {
    public static void main (String args[]){
        System.out.println("Enter the terms upto which you want Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" ");
        for(int i = 0; i<terms; i++){
            c = a+b;
            System.out.print(c+" ");
            b=a;
            a=c;
        }
    }
}
