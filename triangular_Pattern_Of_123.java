/*Write a program in Java to make such a pattern like right angle
triangle with a number which will repeat a number in a row.
1
22
333
4444
 */
package begineer_Level_Exercise_1;

public class triangular_Pattern_Of_123 {
    public static void main (String args[]){
        for(int i = 1; i<5; i++){
            for(int j = 1; j<i+1; j++ ){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
