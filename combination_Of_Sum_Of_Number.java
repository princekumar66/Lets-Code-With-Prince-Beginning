package begineer_Level_Exercise_1;
//Write a Java Program to find the number of combinations that satisfy p+q+r+s = n where n is a given
//number <= 4000 and p,q,r,s in the range of 0 to 1000.
    import java.util.Scanner;
public class combination_Of_Sum_Of_Number {
    public static void main(String args[]) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int p = 0; p <=1000; p++) {
            for (int q = 0; q <= 1000; q++) {
                for (int r = 0; r <= 1000; r++) {
                    for (int s = 0; s <= 1000; s++) {
                        if(p+q+r+s==n){
                            count = count + 1;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
