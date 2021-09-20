package begineer_Level_Exercise_1;
//Write a Java program that reads the side(side sizes between 1 and 10) of square[]//and prints a hollow square using hash(#) character.
    import java.util.Scanner;
public class printing_A_Square_With_Hash {
    public static void main (String args[]){
        System.out.println("Enter the number for print symbolic square");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i<a; i++){
            System.out.print("# ");
        }
        int j = a;
        System.out.println();
        for(int i = a; i>2; i--){
            System.out.print('#');
            while(j>2) {
                System.out.print("  ");
                j--;
            }
            j = a;
            System.out.print(" #");
            System.out.println();
        }
        for(int i = 0; i<a; i++){
            System.out.print("# ");
        }
    }
}
