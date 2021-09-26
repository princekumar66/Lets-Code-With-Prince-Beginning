/* Write a program in Java to display the multiplication table of a given integer.
 */
package begineer_Level_Exercise_1;
    import java.util.Scanner;
public class multiplication_Table {
    public static void main (String args[]) {
        System.out.println("Enter the number whose table you want");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while(i<=10) {
            int table = a * i;
            System.out.println(a + "*" + i + "=" + table);
            i++;
        }
        System.out.println(i);
    }
}
