/*Write a program in Java to make suh a pattern lik right angle triangle with number
increased by 1.
1
2 3
4 5 6
7 8 9 10
 */
package begineer_Level_Exercise_1;

public class right_Angle_Pattern_Incresed_by_One {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int c = 1;
        while (a<4){
            while (b<=a+1){
                System.out.print(c+ " ");
                c = c+1;
                b++;
            }
            b =1;
            System.out.println();
            a++;
        }
    }
}
